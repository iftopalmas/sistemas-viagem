package br.edu.ifto.sistemalocadoraveiculo.entidades;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
public class CategoriaVeiculo {
    @NotBlank
    @Column(unique = true)
    private String descricao;

    @NotBlank
    private String detalhes;


}
