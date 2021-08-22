package br.edu.iftm.teste;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Teste {
    
    @RequestMapping("/alo")
    public String master(Model modelo) {
        modelo.addAttribute("numero1", Math.round(Math.random()*1000000));
        modelo.addAttribute("numero2", Math.round(Math.random()*1000000));
        modelo.addAttribute("numero3", Math.round(Math.random()*1000000));
        modelo.addAttribute("numero4", Math.round(Math.random()*1000000));
        modelo.addAttribute("numero5", Math.round(Math.random()*1000000));
        modelo.addAttribute("numero6", Math.round(Math.random()*1000000)); //gerar numero aleatorio inteiro
        modelo.addAttribute("x", "Alo Mundo");
        return "view1";
    }
}