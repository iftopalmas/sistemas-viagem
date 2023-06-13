package br.edu.ifto.sistemaagenciaviagem.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.edu.ifto.sistemaagenciaviagem.entidades.Cidade;



public interface CidadeRepository extends PagingAndSortingRepository <Cidade, Long>  {
    List<Cidade> cidade(@Param ("cidade") String name );
    
}
