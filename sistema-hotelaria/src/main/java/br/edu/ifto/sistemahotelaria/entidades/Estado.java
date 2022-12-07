package br.edu.ifto.sistemahotelaria.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String uf;

    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades;

}
