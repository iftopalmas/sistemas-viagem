package br.edu.ifto.sistemacompanhiaaerea.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "contato_seguranca")
public class ContatoSeguranca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "grau_parentesco_id")
    private GrauParentesco grauParentesco;

    @NotNull
    @NotBlank
    private String telefone;

    @NotNull
    @NotBlank
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GrauParentesco getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(GrauParentesco grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}