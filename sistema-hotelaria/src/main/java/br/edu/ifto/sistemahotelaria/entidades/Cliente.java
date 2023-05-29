package br.edu.ifto.sistemahotelaria.entidades;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

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

    @OneToOne
    private Endereco endereco;
}
