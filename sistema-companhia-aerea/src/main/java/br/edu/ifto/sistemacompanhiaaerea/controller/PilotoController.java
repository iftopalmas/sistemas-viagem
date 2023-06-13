package br.edu.ifto.sistemacompanhiaaerea.controller;

import br.edu.ifto.sistemacompanhiaaerea.repository.PilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/piloto")
public class PilotoController {
    @Autowired
    private PilotoRepository pilotoRepository;

    @GetMapping("/totalhorasvooporpiloto/{pilotoId}")
    public Long getHorasVooByPilotoId(@PathVariable long pilotoId) {
        return pilotoRepository.getHorasVooByPilotoId(pilotoId);
    }

    @GetMapping("/mediahorasvooporcompanhia/{companhiaAereaId}")
    // retorna um array bidimensional onde o id do piloto está no primeiro campo e a média está no segundo campo
    public Float[][] getMediaHorasVooByCompanhiaAereaId(@PathVariable long companhiaAereaId) {
        return pilotoRepository.getMediaHorasVooByCompanhiaAereaId(companhiaAereaId);
    }
}
