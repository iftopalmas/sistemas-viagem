package br.edu.ifto.sistemalocadoraveiculo.entidades;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.PERSIST)
    private PessoaFisica pessoaFisica;

    @NotNull
    @NotBlank
    private String telefone;

    @Email
    @NotNull
    @NotBlank
    @Column(unique = true)
    private String email;

    @NotNull
    private LocalDate dataCadastro = LocalDate.now();
}
