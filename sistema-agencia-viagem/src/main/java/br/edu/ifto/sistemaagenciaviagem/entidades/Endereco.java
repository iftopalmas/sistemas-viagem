package br.edu.ifto.sistemaagenciaviagem.entidades;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Getter
@Setter
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String logradouro;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Cidade cidade;

    private String bairro;

}