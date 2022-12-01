package br.edu.ifto.sistemalocadoraveiculo.entidades;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Getter
@Setter


public class Reserva {
    @NotNull
    private LocalDateTime dataHoraCadastro;

    @NotNull
    private LocalDateTime dataHoraRetiradaEsperada;

    @NotNull
    private LocalDateTime dataHoraDevolucaoEsperada;

    @NotNull
    private Cliente cliente;

    //@NotNull
    //private  Locadora locadoraRetirada;

    //@NotNull
    //private  Locadora locadoraDevolucao;

}

