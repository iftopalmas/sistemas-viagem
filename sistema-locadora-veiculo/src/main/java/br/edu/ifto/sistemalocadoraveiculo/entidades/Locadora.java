package br.edu.ifto.sistemalocadoraveiculo.entidades;

import com.sun.istack.NotNull;
import lombok.Data;


import javax.persistence.*;

@Data
@Entity
public class Locadora extends PessoaJuridica {
    @NotNull
    private boolean matriz;

    @NotNull
    @Column(unique = true)
    private String codigoIataAeroporto;

}
