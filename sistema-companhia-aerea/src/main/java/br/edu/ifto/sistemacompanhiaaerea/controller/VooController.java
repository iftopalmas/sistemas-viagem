package br.edu.ifto.sistemacompanhiaaerea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifto.sistemacompanhiaaerea.repository.VooRepository;

@RestController

public class VooController {
    @Autowired
    private VooRepository vooRepository;

    @GetMapping("/{companhiaId}/percentual-voos-pontuais")
    public double calcularPercentualVoosPontuaisByCompanhiaAereaId(@PathVariable long companhiaId) {
        return vooRepository.calcularPercentualVoosPontuaisByCompanhiaAereaId(companhiaId);
    }

    @GetMapping("pontuais/{companhiaId}/{ano}")
    public ResponseEntity<Double> calcularPercentualVoosPontuaisByCompanhiaAereaIdAndAno(@PathVariable long companhiaId,
            @PathVariable int ano) {
        Double percentual = vooRepository.calcularPercentualVoosPontuaisByCompanhiaAereaIdAndAno(companhiaId, ano);

        if (percentual != null) {
            return ResponseEntity.ok(percentual);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
