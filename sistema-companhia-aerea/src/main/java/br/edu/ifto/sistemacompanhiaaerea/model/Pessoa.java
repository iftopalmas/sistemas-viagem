package br.edu.ifto.sistemacompanhiaaerea.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    @NotNull
    @NotBlank
    private String nome;

    @ManyToOne
    @NotNull
    @NotBlank
    private Endereco endereco;
}
