package br.edu.ifto.sistemalocadoraveiculo.repositories;

import br.edu.ifto.sistemalocadoraveiculo.entidades.Cliente;
import br.edu.ifto.sistemalocadoraveiculo.entidades.Reserva;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.List;

@RepositoryRestResource (collectionResourceRel ="",path ="")
public interface ReservaRepository extends PagingAndSortingRepository <Reserva, Long> {
    @Override
    Optional<Reserva> findById(@Param("Id")Long id);

    Optional<Cliente> findreservaIdcliente(@Param("Id") Long id);

    List <Reserva> findByIdlocadoraRetirada (@Param("Id")Long id);

    List <Reserva> findByIdlocadoraDevolucao (@Param("Id")Long id);
}
