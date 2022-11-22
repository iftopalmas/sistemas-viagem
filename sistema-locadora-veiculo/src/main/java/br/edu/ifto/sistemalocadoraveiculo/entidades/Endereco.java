package br.edu.ifto.sistemalocadoraveiculo.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @NotBlank
    private String logradouro;

    @NotNull
    @NotBlank
    private String cep;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cidade_cod", referencedColumnName = "id")
    private Cidade cidade;
}