package br.edu.ifto.sistemacompanhiaaerea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifto.sistemacompanhiaaerea.repository.VooRepository;


@RestController
@RequestMapping("/media-pontualidade")
public class VooController {
  @Autowired
  private VooRepository vooRepository;

   @GetMapping("/{companhiaId}")
    public Double calcularMediaVoosPontuaisByCompanhiaAereaId(@PathVariable("companhiaId") Long companhiaId) {
        return vooRepository.calcularMediaVoosPontuaisByCompanhiaAereaId(companhiaId);
    }
}
