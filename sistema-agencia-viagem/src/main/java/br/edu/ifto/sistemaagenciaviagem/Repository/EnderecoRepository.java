package br.edu.ifto.sistemaagenciaviagem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifto.sistemaagenciaviagem.entidades.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository <Endereco, Long> {
  
}
