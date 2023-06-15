package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Piloto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "pilotos", path = "pilotos")
public interface PilotoRepository extends PagingAndSortingRepository<Piloto, Long> {
    @GetMapping("/cpf/{cpf}")
    Optional<Piloto> findByPessoaFisicaCpf(@PathVariable String cpf);

    @GetMapping("/ativo/{companhiaId}")
    @Query("select p from Piloto p where p.ativo = true and p.companhiaAerea.id = :companhiaId")
    List<Piloto> findPilotosAtivosByCompanhiaId(@PathVariable long companhiaId);

    @GetMapping("/total-horas-voo/{pilotoId}")
    @Query("select sum(datediff(hour, v.dataHoraPartida,v.dataHoraChegada)) from Voo v where v.piloto.id = :pilotoId")
    long getHorasVooByPilotoId(@PathVariable long pilotoId);

    /** {@return uma matriz de duas colunas} Cada linha representa um registro onde o id do piloto está na 1ª coluna
     *  e a média está no 2ª. */
    @GetMapping("/media-horas-voo/{companhiaAereaId}")
    @Query("""
           select v.piloto.id as pilotoId, avg(datediff(hour, v.dataHoraPartida,v.dataHoraChegada)) as mediaHorasVoo
           from Voo v where v.companhiaAerea.id = :companhiaAereaId group by v.piloto.id
           """)
    float[][] getMediaHorasVooByCompanhiaAereaId(@PathVariable long companhiaAereaId);
}
