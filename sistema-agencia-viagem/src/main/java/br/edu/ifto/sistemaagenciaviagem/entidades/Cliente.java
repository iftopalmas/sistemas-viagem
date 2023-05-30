package br.edu.ifto.sistemaagenciaviagem.entidades;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String nome;

    @CPF
    @Column(unique = true)
    private String cpf;

    private LocalDate dataNascimento;

    @NotBlank
    private String celular;

    private boolean fumante;

    @ManyToOne
    private Endereco endereco;
}
