package br.edu.ifto.sistemacompanhiaaerea.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cidades", path = "cidades")
public interface CidadeRepository {
}
