package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Aeroporto;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RepositoryRestResource(path = "aeroportos", collectionResourceRel = "aeroportos")
public interface AeroportoRepository extends PagingAndSortingRepository<Aeroporto, Long> {
    @GetMapping("/cidade/{cidadeId}")
    List<Aeroporto> findAeroportoByCidadeId(@PathVariable Long cidadeId);

    @GetMapping("/estado/{uf}")
    List<Aeroporto> findAeroportoByCidade_EstadoUf(@PathVariable String uf);

    @GetMapping("/iata/{codigoIata}")
    Aeroporto findAeroportoByCodigoIata(@PathVariable String codigoIata);
}

