package br.edu.ifto.sistemalocadoraveiculo.entidades;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Veiculo {
    @NotBlank
    @Column(unique = true)
    private String placa;


    private Modelo modelo;


    @NotNull
    private CategoriaVeiculo categoria;


    private Locadora locadora;
}
