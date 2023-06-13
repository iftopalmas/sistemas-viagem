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
    List<Piloto> findPilotosAtivosByCompanhiaId(@PathVariable Long companhiaId);

    @GetMapping("/totalhorasvooporpiloto/{pilotoId}")
    @Query("select sum(datediff(hour,v.dataHoraPartida,v.dataHoraChegada)) from Voo v where v.piloto.id = :pilotoId")
    Long getHorasVooByPilotoId(@PathVariable Long pilotoId);

    @GetMapping("/mediahorasvooporcompanhia/{companhiaAereaId}")
    @Query("select v.piloto.id as pilotoId, avg(datediff(hour,v.dataHoraPartida,v.dataHoraChegada)) as mediaHorasVoo " +
        "from Voo v where v.companhiaAerea.id = :companhiaAereaId group by v.piloto.id")
    // retorna um array bidimensional onde o id do piloto está no primeiro campo e a média está no segundo campo
    Float[][] getMediaHorasVooByCompanhiaAereaId(@PathVariable Long companhiaAereaId);
}
