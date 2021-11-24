package com.lauracristina.redballoon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedBalloonController {

    @RequestMapping("/")
    public String exibeHome() {
        return "telaInicial";
    }

    @RequestMapping("/avisos")
    public String exibeAvisos() {
        return "telaAvisos";
    }

    @RequestMapping("/responsavel")
    public String exibeResponsavel() {
        return "dadosResponsavel";
    }

    @RequestMapping("/horarios")
    public String exibeHorarios() {
        return "horarios";
    }

    @RequestMapping("/financeiro")
    public String exibeFinanceiro() {
        return "financeiro";
    }

    @RequestMapping("/listar")
    public String exibeListar() {
        return "alunos/listar";
    }

}