package br.edu.ifto.sistemalocadoraveiculo.repositories;

import br.edu.ifto.sistemalocadoraveiculo.entidades.CategoriaVeiculo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@RepositoryRestResource(collectionResourceRel = "categoriaVeiculos", path = "categoriaVeiculos")
public interface CategoriaVeiculoRepository extends PagingAndSortingRepository<CategoriaVeiculo, Long> {
    List<CategoriaVeiculo> findById(@PathVariable String id);
    List<CategoriaVeiculo> findByDescricao(@PathVariable String descricao);
}
