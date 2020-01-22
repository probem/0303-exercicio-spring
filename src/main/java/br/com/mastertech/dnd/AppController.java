package br.com.mastertech.dnd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    public String mostrarHome(){
        return "<h1>Boas Vindas!</h1>" +
                "<a href=\"form\">Iniciar</a>";
    }

    @GetMapping("/form")
    public String mostrarForm(){
        return "<form action=\"resultado\">" +
                "<input type=\"text\" placeholder=\"Lados\">" +
                "<input type=\"text\" placeholder=\"Vezes\">" +
                "<button>Jogar</button>" +
                "</form>";
    }

    @GetMapping("/resultado")
    public String mostrarResultado(){
        return "<p>O resultado é 100";
    }
}
