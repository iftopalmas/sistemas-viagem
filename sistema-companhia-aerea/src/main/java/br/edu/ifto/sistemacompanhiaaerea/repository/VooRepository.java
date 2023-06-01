package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Voo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource (collectionResourceRel ="voos", path = "voos")
public interface VooRepository extends PagingAndSortingRepository <Voo , Long> {
    @GetMapping("/numero/{numero}")
    Optional <Voo> findByNumero(@Param("numero") String numero);

    @GetMapping("/origem/{aeroportoId}")
    List <Voo> findByAeroportoOrigemId(@Param("aeroportoId") Long aeroportoId);

    @GetMapping("/destino/{aeroportoId}")
    List <Voo> findByAeroportoDestinoId(@Param("aeroportooId") Long aeroportoId);

    @GetMapping("/companhia/{companhiaId}")
    List<Voo> findByCompanhiaAereaId(@Param("companhiaId") Long companhiaId);
}
