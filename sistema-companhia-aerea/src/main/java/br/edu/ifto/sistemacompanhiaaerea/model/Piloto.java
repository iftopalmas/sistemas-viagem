package br.edu.ifto.sistemacompanhiaaerea.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private PessoaFisica pessoaFisica;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private String numeroBreve;

    @NotNull
    @NotBlank
    private LocalDate validadeBreve;
}
