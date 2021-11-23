package iftm.edu.br.redballon2.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import iftm.edu.br.redballon2.Model.redModel;
import iftm.edu.br.redballon2.Repository.redRepository;

@Controller
public class redControler {

    @Autowired
    redRepository repo;

    @GetMapping("/index")
    public String alunosRedBallon (Model modelo){
        List<redModel> lista = repo.buscarProf();
        modelo.addAttribute("index", lista);
        return "index";
    }


}

