package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.MarcaAviao;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "marcasAvioes", path = "marcasAvioes")
public interface MarcaAviaoRepository extends PagingAndSortingRepository<MarcaAviao, Long> {
    MarcaAviao findMarcaAviaoById(@Param("id") Long id);

    MarcaAviao findMarcaAviaoByDescricao(@Param("descricao") String descricao);
}
