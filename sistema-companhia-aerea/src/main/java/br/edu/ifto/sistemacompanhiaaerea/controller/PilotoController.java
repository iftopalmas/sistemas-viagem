package br.edu.ifto.sistemacompanhiaaerea.controller;

import br.edu.ifto.sistemacompanhiaaerea.model.Piloto;
import br.edu.ifto.sistemacompanhiaaerea.repository.PilotoRepository;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/pilotos/cpf/{cpf}")
    public Piloto findByPessoaFisicaCpf(@PathVariable String cpf) {
        return repository.findByPessoaFisicaCpf(cpf).orElseThrow();
    }

    @PostMapping("/pilotos")
    public void save(@RequestBody Piloto piloto) {
        repository.save(piloto);
    }

    @PutMapping("/pilotos/{id}")
    public void update(@RequestBody Piloto piloto) {
        repository.save(piloto);
    }
}
