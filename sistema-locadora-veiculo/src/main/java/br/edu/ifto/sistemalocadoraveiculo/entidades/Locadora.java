package br.edu.ifto.sistemalocadoraveiculo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Locadora extends PessoaJuridica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private boolean matriz;

    @NotNull
    @Column(unique = true)
    private String codigoIataAeroporto;

}
