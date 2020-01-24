package br.com.mastertech.dnd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
    @GetMapping
    public String mostrarHome(){
        return "index";
    }

    @GetMapping("/form")
    public String mostrarForm(){
        return "form";
    }

    @PostMapping("/resultado")
    public String mostrarResultado(){
        return "resultado";
    }
}
