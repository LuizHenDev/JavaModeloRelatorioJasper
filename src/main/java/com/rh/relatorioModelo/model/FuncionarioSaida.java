package com.rh.relatorioModelo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class FuncionarioSaida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdFormulario;
    private  String ResponsavelSaida;
    private String Funcionario;
    private Date HorarioSaida;
    private String CPFFuncionario;

}
