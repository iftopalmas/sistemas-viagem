package br.edu.ifto.sistemalocadoraveiculo.entidades;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    @NotNull
    private Cliente cliente;

    //@NotNull private  Locadora locadoraRetirada;  TODO: Depende de #54

    //@NotNull private  Locadora locadoraDevolucao; TODO: Depende de #54

}

