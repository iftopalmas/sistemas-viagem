package br.edu.ifto.sistemacompanhiaaerea.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private PessoaFisica pessoaFisica;

    @NotNull
    private boolean ativo;

    @ManyToOne
    private CompanhiaAerea companhiaAerea;

    /**
     * Número do Brevê do piloto.
     */
    @NotNull
    @NotBlank
    @Column(unique = true)
    private String numeroBreve;

    @NotNull
    private LocalDate validadeBreve;
}
