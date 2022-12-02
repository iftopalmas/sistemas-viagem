package br.edu.ifto.sistemacompanhiaaerea.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Piloto {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private PessoaFisica pessoaFisica;

    @Column(unique = true)
    @NotNull
    @NotBlank
    private String numeroBreve;

    @NotNull
    @NotBlank
    private LocalDate validadeBreve;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public String getNumeroBreve() {
        return numeroBreve;
    }

    public void setNumeroBreve(String numeroBreve) {
        this.numeroBreve = numeroBreve;
    }

    public LocalDate getValidadeBreve() {
        return validadeBreve;
    }

    public void setValidadeBreve(LocalDate validadeBreve) {
        this.validadeBreve = validadeBreve;
    }
}
