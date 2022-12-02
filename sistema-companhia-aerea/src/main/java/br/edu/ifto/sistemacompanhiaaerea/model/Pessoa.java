package br.edu.ifto.sistemacompanhiaaerea.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long  id;

    @NotNull
    @NotBlank
    @Getter
    @Setter
    private String nome;

    @ManyToOne
    @NotNull
    @NotBlank
    @Getter
    @Setter
    private Endereco endereco;
}
