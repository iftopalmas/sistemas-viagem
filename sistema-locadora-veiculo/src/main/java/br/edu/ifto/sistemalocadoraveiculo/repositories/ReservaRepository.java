package br.edu.ifto.sistemalocadoraveiculo.repositories;

import br.edu.ifto.sistemalocadoraveiculo.entidades.Locadora;
import br.edu.ifto.sistemalocadoraveiculo.entidades.Reserva;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDateTime;
import java.util.List;

@RepositoryRestResource (collectionResourceRel ="reservas", path ="reservas")
public interface ReservaRepository extends PagingAndSortingRepository <Reserva, Long> {

    List<Reserva> findByClienteId(Long id);

    List <Reserva> findByLocadoraRetiradaId(Long id);

    List <Reserva> findByLocadoraDevolucaoId(Long id);

    List <Reserva> findByDataHoraCadastroBetweenAndClienteId(
        @NotNull LocalDateTime dataHoraCadastroInicio,
        @NotNull LocalDateTime dataHoraCadastroFim,
        long id
    );

    List <Reserva> findByLocadoraRetiradaIdAndClienteId(
        long locadoraRetiradaId,
        long id
    );
}
