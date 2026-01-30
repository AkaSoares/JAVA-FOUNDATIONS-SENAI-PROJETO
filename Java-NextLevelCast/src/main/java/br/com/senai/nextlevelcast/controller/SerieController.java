package br.com.senai.nextlevelcast.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.nextlevelcast.dto.SerieDTO;
import br.com.senai.nextlevelcast.service.SerieService;

@RestController
@RequestMapping("/series")

public class SerieController {

    private final SerieService servico;

    public SerieController(SerieService servico) {
        this.servico = servico;
    }

    @GetMapping
    public List<SerieDTO> obterSeries() {
        return servico.obterTodasAsSeries();
    }
    
    @GetMapping("/top5")
    public List<SerieDTO> obterTop5() {
        return servico.obterTop5Series();
    }
    
   
    @GetMapping("/series/lancamentos")
    public List<SerieDTO> obterLancamentos() {
        return servico.obterLancamentos();
    }

}
