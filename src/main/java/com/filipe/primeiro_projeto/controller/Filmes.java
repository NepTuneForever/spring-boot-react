package com.filipe.primeiro_projeto.controller;


import com.filipe.primeiro_projeto.Films;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")

@RestController
public class Filmes {

    @GetMapping("/src/filmes")
    public List<Films> listar()
    {
        return List.of(
                new Films("Street Figther", "Um jovem lutador bla bla bla", 18),
                new Films("O Poderoso Chefão", "Filme sobre a máfia", 16),
                new Films("Toy Story", "Filme de brinquedos", 0)
        );
    }
}
