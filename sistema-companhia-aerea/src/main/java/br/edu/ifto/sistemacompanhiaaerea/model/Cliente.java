package br.edu.ifto.sistemacompanhiaaerea.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String telefone;

    @Column(unique = true)
    @Email
    @NotNull
    @NotBlank
    private String email;

    @ManyToOne
    private ContatoSeguranca contatoSeguranca;
}
