package edu.redballoon.br.redballoon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Redballoon {
    
    @RequestMapping("/")
        public String alo(){
            return "index";
        }
    
    
}
