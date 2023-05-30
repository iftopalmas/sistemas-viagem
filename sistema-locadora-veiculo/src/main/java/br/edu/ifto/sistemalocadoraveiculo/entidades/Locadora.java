package br.edu.ifto.sistemalocadoraveiculo.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
public class Locadora extends PessoaJuridica {
    @NotNull
    private boolean matriz;

    @NotNull
    @Column(unique = true)
    private String codigoIataAeroporto;

}
