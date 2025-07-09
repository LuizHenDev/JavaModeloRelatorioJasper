package com.rh.relatorioModelo.controller;

import com.rh.relatorioModelo.model.FuncionarioSaida;
import com.rh.relatorioModelo.services.ModeloRelatorioServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Relatorio")
public class RelatorioModeloController {

    private ModeloRelatorioServices modeloRelatorioServices;

    RelatorioModeloController(ModeloRelatorioServices modeloRelatorioServices){
        this.modeloRelatorioServices = modeloRelatorioServices;
    }

    @PostMapping("/Saida")
    public void GerarRelatorioSaida(@RequestBody FuncionarioSaida funcionarioSaida){
        this.modeloRelatorioServices.gerarRelatorio(funcionarioSaida);
    }
}
