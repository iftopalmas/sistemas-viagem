package br.edu.ifto.sistemalocadoraveiculo.entidades;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Modelo {

        @NotBlank
        @Column(unique = true)
        private String descricao;

        @NotNull
        private Marca marca;
}
