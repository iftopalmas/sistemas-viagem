package br.edu.ifto.sistemalocadoraveiculo.entidades;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class CategoriaVeiculo {
    @NotBlank
    @Column(unique = true)
    private String descricao;

    @NotBlank
    private String detalhes;


}
