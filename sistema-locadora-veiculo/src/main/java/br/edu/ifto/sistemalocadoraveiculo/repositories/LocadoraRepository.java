package br.edu.ifto.sistemalocadoraveiculo.repositories;

import br.edu.ifto.sistemalocadoraveiculo.entidades.Locadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(collectionResourceRel = "locadoras", path = "locadoras")
public interface LocadoraRepository extends PagingAndSortingRepository<Locadora, Long>, JpaRepository<Locadora, Long> {
    List<Locadora> findLocadorasByEnderecoCidadeId(Long idCidade);
    List<Locadora> findLocadorasByCodigoIataAeroporto(String codIataAeroporto);
}

