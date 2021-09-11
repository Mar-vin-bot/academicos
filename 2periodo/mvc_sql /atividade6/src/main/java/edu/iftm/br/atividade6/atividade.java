package edu.iftm.br.atividade6;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class atividade {
    
    @RequestMapping("/")
    String inicio(){
        return "home";
    }
    @RequestMapping("/pg2")
    String fim(){
        return "home2";  // verificar a troca desse return
    }
}
