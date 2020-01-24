package br.com.mastertech.dnd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String mostrarResultado(@ModelAttribute Formulario formulario, Model model) {
        try {
            Dado dado = new Dado(formulario.getLados());
            Sorteador sorteador = new Sorteador(dado);
            Resultado resultado = sorteador.sortear(formulario.getVezes());

            model.addAttribute("resultado", resultado);

            return "resultado";
        }catch (DadoInvalidoException e){
            return "erro";
        }
    }
}
