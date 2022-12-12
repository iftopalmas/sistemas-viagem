package br.edu.ifto.sistemalocadoraveiculo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.ifto.sistemalocadoraveiculo.entidades.Veiculo;

@RepositoryRestResource(collectionResourceRel = "veiculos", path = "veiculos")
public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, Long> {
  Veiculo findByPlaca(@Param("placa") String placa);
  List<Veiculo> findByLocadoraId(@Param("locadoraId") String locadoraId);
  List<Veiculo> findByLocadoraIdAndCategoria(@Param("locadoraId") long locadoraId, @Param("categoriaId") long categoriaId);
  List<Veiculo> findByModelo(@Param("modeloId") long modeloId);
}
