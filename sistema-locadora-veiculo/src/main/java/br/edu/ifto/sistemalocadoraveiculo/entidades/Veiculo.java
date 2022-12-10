package br.edu.ifto.sistemalocadoraveiculo.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String placa;

    @ManyToOne(cascade = CascadeType.ALL)
    private Modelo modelo;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private CategoriaVeiculo categoria;

    @ManyToOne(cascade = CascadeType.ALL)
    private Locadora locadora;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}