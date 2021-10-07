package edu.redballoon.br.redballoon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Redballoon {

    @RequestMapping("/")
    public String exibeHome() {
        return "index";
    }

    @RequestMapping("/matricula")
    public String exibeMatricula() {
        return "matricula";
    }

    @RequestMapping("/login")
    public String exibeLogin() {
        return "login";
    }

    @RequestMapping("/horarios")
    public String exibeHorarios() {
        return "horarios";
    }

    @RequestMapping("/financeiro")
    public String exibeFinanceiro() {
        return "financeiro";
    }

    @RequestMapping("/alterarSenha")
    public String exibe_alterarSenha() {
        return "alterarSenha";
    }

}
