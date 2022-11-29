package br.edu.ifto.sistemalocadoraveiculo;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;
@Getter
@Entity
public class Locadora extends PessoaJuridica {
    @NotNull
    private boolean matriz;
    @NotNull
    private String codigoIataAeroporto;






}
