package br.edu.ifto.sistemacompanhiaaerea.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @NotNull
    @NotBlank
    @Getter
    @Setter
    private String telefone;

    @Column(unique = true)
    @Email
    @NotNull
    @NotBlank
    @Getter
    @Setter
    private String email;

    @ManyToOne
    @Getter
    @Setter
    private ContatoSeguranca contatoSeguranca;
}
