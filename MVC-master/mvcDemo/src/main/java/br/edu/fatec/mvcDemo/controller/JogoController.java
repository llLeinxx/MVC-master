package br.edu.fatec.mvcDemo.controller;

import br.edu.fatec.mvcDemo.modelo.Jogo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/jogos")
public class JogoController {
    public JogoController() {
        jogos.add(new Jogo("Elden ring","FromSoftware"));
        jogos.add(new Jogo("LoL","Riot Games"));
        jogos.add(new Jogo("Path of Exile","GGG"));
    }
    private static final List<Jogo> jogos = new ArrayList<Jogo>();
    @GetMapping
    public String getAmigos(Model model){
        model.addAttribute("jogos",jogos);
        return "jogos";}
}

