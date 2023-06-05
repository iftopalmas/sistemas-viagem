package br.edu.ifto.sistemacompanhiaaerea.repository;
import br.edu.ifto.sistemacompanhiaaerea.model.Piloto;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;
@RepositoryRestResource(collectionResourceRel = "pilotos", path = "pilotos")
public interface PilotoRepository extends PagingAndSortingRepository<Piloto, Long> {
    Optional<Piloto> findByPessoaFisicaCpf(@Param("cpf") String cpf);
    Optional<List<Piloto>> findPilotoByAtivo(@Param("ativo") Boolean ativo);
}
