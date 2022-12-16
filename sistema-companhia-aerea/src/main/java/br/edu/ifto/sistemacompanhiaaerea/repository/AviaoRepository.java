package br.edu.ifto.sistemacompanhiaaerea.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Aviao", path = "Avioes")
public interface AviaoRepository {
}
