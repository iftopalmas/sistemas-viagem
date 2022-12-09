package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Estado;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import br.edu.ifto.sistemacompanhiaaerea.model.Cidade;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cidades", path = "cidades")
public interface CidadeRepository extends PagingAndSortingRepository<Cidade, Long> {
    Cidade findCidadeById(@Param("id") Long id);
    Cidade findCidadeByNome(@Param("nome") String nome);
    List<Cidade> findCidadeByEstado_Uf(@Param("uf") String uf);

}
