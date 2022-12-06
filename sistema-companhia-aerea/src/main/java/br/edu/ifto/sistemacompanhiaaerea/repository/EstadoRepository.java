package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Estado;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "estados", path = "estados")
public interface EstadoRepository extends PagingAndSortingRepository<Estado, Long> {
    Estado findEstadoById(@Param("id") Long id);

    Estado findEstadoByNome(@Param("nome") String nome);

    List<Estado> findEstadosByUf(@Param("uf") String uf);

    List<Estado> findAll();
}
