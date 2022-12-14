package br.edu.ifto.sistemalocadoraveiculo.entidades;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

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
