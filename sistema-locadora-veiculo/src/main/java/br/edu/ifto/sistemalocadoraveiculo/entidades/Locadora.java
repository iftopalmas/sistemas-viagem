package br.edu.ifto.sistemalocadoraveiculo.entidades;

import com.sun.istack.NotNull;
import lombok.Getters;
import lombok.Setters;

import javax.persistence.*;

@Getters
@Setters
@Entity
public class Locadora extends PessoaJuridica {

    @NotNull
    private boolean matriz;
    
    @NotNull
    private String codigoIataAeroporto;

}
