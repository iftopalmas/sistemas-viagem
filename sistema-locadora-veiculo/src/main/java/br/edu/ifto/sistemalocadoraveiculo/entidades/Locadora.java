package br.edu.ifto.sistemalocadoraveiculo.entidades;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Locadora extends PessoaJuridica {

    @NotNull
    private boolean matriz;
    
    @NotNull
    private String codigoIataAeroporto;

}
