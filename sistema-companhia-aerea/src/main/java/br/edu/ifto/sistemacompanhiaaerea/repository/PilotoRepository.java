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
}
