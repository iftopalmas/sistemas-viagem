package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PilotoRepository extends JpaRepository<Piloto, Long> {
    Optional<Piloto> findByPessoaFisicaCpf(@Param("cpf") String cpf);
}
