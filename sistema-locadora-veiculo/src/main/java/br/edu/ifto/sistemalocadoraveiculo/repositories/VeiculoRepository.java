package br.edu.ifto.sistemalocadoraveiculo.repositories;

import br.edu.ifto.sistemalocadoraveiculo.entidades.Veiculo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "veiculos", path = "veiculos")
public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, Long> {
  Veiculo findByPlaca(@Param("placa") String placa);
  List<Veiculo> findByLocadoraId(@Param("locadoraId") long locadoraId);
  List<Veiculo> findByLocadoraIdAndCategoriaId(@Param("locadoraId") long locadoraId, @Param("categoriaId") long categoriaId);
  List<Veiculo> findByModeloId(@Param("modeloId") long modeloId);
}
