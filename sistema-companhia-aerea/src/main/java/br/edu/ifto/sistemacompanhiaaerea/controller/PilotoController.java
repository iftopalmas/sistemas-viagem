package br.edu.ifto.sistemacompanhiaaerea.controller;

import br.edu.ifto.sistemacompanhiaaerea.model.Piloto;
import br.edu.ifto.sistemacompanhiaaerea.repository.PilotoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PilotoController {
    private final PilotoRepository repository;

    public PilotoController(PilotoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/pilotos")
    public List<Piloto> findAll() {
        return repository.findAll();
    }

    @GetMapping("/pilotos/{id}")
    public Piloto findById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }
}
