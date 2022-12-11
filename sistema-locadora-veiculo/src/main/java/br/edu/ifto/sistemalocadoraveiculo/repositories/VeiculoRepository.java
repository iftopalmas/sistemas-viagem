package br.edu.ifto.sistemalocadoraveiculo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.ifto.sistemalocadoraveiculo.entidades.Veiculo;

@RepositoryRestResource(collectionResourceRel = "veiculos", path = "veiculos")
public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, Long> {
  @Override
  default Optional<Veiculo> findById(Long id) {
    // TODO Auto-generated method stub
    return Optional.empty();
  }

  List<Veiculo> findByPlaca(@Param("placa") String placa);
  List<Veiculo> findByLocadoraId(@Param("locadoraId") String locadoraId);
  List<Veiculo> findByLocadoraIdAndCategoria(@Param("locadoraId") String locadoraId, @Param("categoria") String categoria);
  List<Veiculo> findByModelo(@Param("modelo") String modelo);
}
