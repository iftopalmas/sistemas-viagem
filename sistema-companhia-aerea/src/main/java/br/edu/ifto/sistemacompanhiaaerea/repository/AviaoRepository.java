package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Aviao;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "avioes", path = "avioes")
public interface AviaoRepository extends PagingAndSortingRepository<Aviao, Long> {
    List<Aviao> findAviaoByPrefixo(String prefixo);
}
