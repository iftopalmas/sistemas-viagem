package br.edu.ifto.sistemacompanhiaaerea.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "marcasAvioes", path = "marcasAvioes")
public interface MarcaAviaoRepository {
}
