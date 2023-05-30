package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Voo;
import br.edu.ifto.sistemacompanhiaaerea.model.CompanhiaAerea;
import br.edu.ifto.sistemacompanhiaaerea.model.Aeroporto;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource (collectionResourceRel ="voos", path = "voos")
public interface VooRepository extends PagingAndSortingRepository <Voo , Long> {
    @GetMapping("/numero/{numero}")
    Optional <Voo> findByNumero(@PathVariable String numero);

    @GetMapping("/origem/{aeroportoId}")
    List <Voo> findByAeroportoOrigem (@PathVariable Long aeroportoId);

    @GetMapping("/destino/{aeroportoId}")
    List <Voo> findByAeroportoDestino(@PathVariable Long aeroportoId);

    @GetMapping("/companhia/{companhiaId}")
    List<Voo> findByNome(@PathVariable Long companhiaId);
}
