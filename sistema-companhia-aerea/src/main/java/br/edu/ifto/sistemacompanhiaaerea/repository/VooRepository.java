package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Voo;
import br.edu.ifto.sistemacompanhiaaerea.model.CompanhiaAerea;
import br.edu.ifto.sistemacompanhiaaerea.model.Aeroporto;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource (collectionResourceRel ="Voo",path = "Voo")
public interface VooRepository extends PagingAndSortingRepository <Voo , Long> {
//    @Override
//  Optional<Voo> findById(@Param("Id")Long id);
// Optional<Voo> findnumeroBynumero(@Param("numero") String numero);


    List <Aeroporto> VOO_LIST_aeroportoOrigem_ID (@Param("Id")Long id);

    List <Aeroporto> VOO_LIST_aeroportoDestino_ID(@Param("Id")Long id);

    List <CompanhiaAerea> COMPANHIA_AEREA_LIST_ID(@Param("Id")Long id);




}
