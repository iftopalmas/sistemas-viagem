package br.edu.ifto.sistemalocadoraveiculo.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Getter
@Setter
@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    
    @NotNull
    private LocalDateTime dataHoraCadastro = LocalDateTime.now();

    @NotNull
    private LocalDateTime dataHoraRetiradaEsperada;

    @NotNull
    private LocalDateTime dataHoraDevolucaoEsperada;

    @ManyToOne
    @NotNull
    private Cliente cliente;

    @ManyToOne
    @NotNull private  Locadora locadoraRetirada;

    @ManyToOne
    @NotNull private  Locadora locadoraDevolucao;

    @ManyToOne
    @NotNull private Veiculo Veiculo;
}

