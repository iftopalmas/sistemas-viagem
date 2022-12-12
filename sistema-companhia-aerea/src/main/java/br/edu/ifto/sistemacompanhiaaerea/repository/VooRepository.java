package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Voo;
import br.edu.ifto.sistemacompanhiaaerea.model.CompanhiaAerea;
import br.edu.ifto.sistemacompanhiaaerea.model.Aeroporto;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource (collectionResourceRel ="voos",path = "voos")
public interface VooRepository extends PagingAndSortingRepository <Voo , Long> {
    Optional <Voo> findByNumero(@Param("numero") String numero);

    List <Aeroporto> findByAeroportoOrigem (@Param("aeroportoOrigem")Long aeroportoOrigem);

    List <Aeroporto> findByAeroportoDestino(@Param("aeroportoDestino")Long aeroportoDestino);

    List<CompanhiaAerea> findByNome(@Param("nome") String nome);
}
