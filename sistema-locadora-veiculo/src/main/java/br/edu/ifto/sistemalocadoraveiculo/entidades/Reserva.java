package br.edu.ifto.sistemalocadoraveiculo.entidades;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @NotNull
    private LocalDateTime dataHoraCadastro = LocalDateTime.now();

    @NotNull
    private LocalDateTime dataHoraRetiradaEsperada;

    @NotNull
    private LocalDateTime dataHoraDevolucaoEsperada;

    /**
     * Data/hora em que o veículo foi de fato devolvido (se já realmente foi).
     */
    private LocalDateTime dataHoraDevolucao;

    @ManyToOne
    @NotNull
    private Cliente cliente;

    @ManyToOne
    @NotNull private  Locadora locadoraRetirada;

    @ManyToOne
    @NotNull private  Locadora locadoraDevolucao;

    @ManyToOne
    @NotNull private Veiculo Veiculo;

    @NotNull
    @ManyToOne
    private FormaPagamento formaPagamento;
}

