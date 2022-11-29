package br.edu.ifto.sistemacompanhiaaerea.model.entity;

import br.edu.ifto.sistemacompanhiaaerea.Cidade;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Aeroporto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(unique = true)
    private String nome;
    @ManyToOne
    @NotNull
    private Cidade cidade;
    @NotBlank
    @Column(unique = true)
    @NotBlank
    private String codigolata;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCodigolata() {
        return codigolata;
    }

    public void setCodigolata(String codigolata) {
        this.codigolata = codigolata;
    }
}
