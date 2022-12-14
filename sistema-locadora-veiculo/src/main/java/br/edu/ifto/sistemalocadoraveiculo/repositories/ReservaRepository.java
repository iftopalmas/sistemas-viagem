package br.edu.ifto.sistemalocadoraveiculo.repositories;

import br.edu.ifto.sistemalocadoraveiculo.entidades.Cliente;
import br.edu.ifto.sistemalocadoraveiculo.entidades.Reserva;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.List;

@RepositoryRestResource (collectionResourceRel ="reservas", path ="reservas")
public interface ReservaRepository extends PagingAndSortingRepository <Reserva, Long> {

    List<Reserva> findByClienteId(Long id);

    List <Reserva> findByLocadoraRetiradaId(Long id);

    List <Reserva> findByLocadoraDevolucaoId(Long id);
}
