package com.rh.relatorioModelo.services;

import com.rh.relatorioModelo.model.FuncionarioSaida;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ModeloRelatorioServices {
    public void gerar(FuncionarioSaida funcionarioSaida){
        Map <String, Object> dados = new HashMap<>();
        dados.put("Funcionario",funcionarioSaida);
    }
}
