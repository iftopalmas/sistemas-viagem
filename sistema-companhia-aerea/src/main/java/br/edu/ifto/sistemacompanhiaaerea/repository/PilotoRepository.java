package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pilotos", path = "pilotos")
public interface PilotoRepository extends JpaRepository<Piloto, Long> {
}
