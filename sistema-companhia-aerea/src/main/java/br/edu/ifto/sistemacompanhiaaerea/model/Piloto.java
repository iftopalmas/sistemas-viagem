package br.edu.ifto.sistemacompanhiaaerea.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @ManyToOne
    @Getter
    @Setter
    private PessoaFisica pessoaFisica;

    @NotNull
    @NotBlank
    @Getter
    @Setter
    @Column(unique = true)
    private String numeroBreve;

    @NotNull
    @NotBlank
    @Getter
    @Setter
    private LocalDate validadeBreve;
}
