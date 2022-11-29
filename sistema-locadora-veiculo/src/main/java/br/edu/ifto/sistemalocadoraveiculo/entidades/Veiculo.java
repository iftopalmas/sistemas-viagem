package br.edu.ifto.sistemalocadoraveiculo.entidades;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Veiculo {
    @NotBlank
    @Column(unique = true)
    private String placa;


    private Modelo modelo;


    @NotNull
    private CategoriaVeiculo categoria;


    private Locadora locadora;
    //Falta a issue#54
}
