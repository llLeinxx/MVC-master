package br.edu.fatec.mvcDemo.controller;

import br.edu.fatec.mvcDemo.modelo.Jogo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

    @RestController
    @RequestMapping("api/jogos")
    public class DadosController {
        private static final List<Jogo>
                jogos = new ArrayList<Jogo>();

        public DadosController() {
            jogos.add(new Jogo("Elden ring","FromSoftware"));
            jogos.add(new Jogo("LoL","Riot Games"));
            jogos.add(new Jogo("Path of Exile","GGG"));
        }

        @GetMapping
        public List<Jogo> getAmigos()
        {
            return jogos;
        }
    }
