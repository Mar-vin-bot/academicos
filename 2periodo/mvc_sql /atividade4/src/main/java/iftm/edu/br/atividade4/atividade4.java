package iftm.edu.br.atividade4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
   
@Controller
public class atividade4 {  

@RequestMapping("/alo")
public String master(Model modelo) {
    return "index";
    }
}

