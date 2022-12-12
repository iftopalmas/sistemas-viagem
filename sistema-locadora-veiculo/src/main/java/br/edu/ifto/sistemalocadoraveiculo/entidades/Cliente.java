package br.edu.ifto.sistemalocadoraveiculo.entidades;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Pessoa pessoa;

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
