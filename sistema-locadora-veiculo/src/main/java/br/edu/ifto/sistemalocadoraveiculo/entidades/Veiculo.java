package br.edu.ifto.sistemalocadoraveiculo.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String placa;

    @ManyToOne(cascade = CascadeType.ALL)
    private Modelo modelo;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private CategoriaVeiculo categoria;

    @ManyToOne(cascade = CascadeType.ALL)
    private Locadora locadora;
}