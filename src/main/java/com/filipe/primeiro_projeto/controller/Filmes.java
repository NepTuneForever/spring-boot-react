package com.filipe.primeiro_projeto.controller;


import com.filipe.primeiro_projeto.models.Films;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")

@RestController
public class Filmes {

    int id=1;

    @GetMapping("/src/filmes")
    public List<Films> listar()
    {
        return List.of(
                new Films(id++, "Street Figther", "Um jovem lutador bla bla bla", 14, "http://localhost:8080/images/streetfighter.jpg"),
                new Films(id++, "Scarface", "Filme sobre a máfia", 18, "http://localhost:8080/images/scarface.jpg"),
                new Films(id++, "Toy Story", "Filme de brinquedos", 0, "http://localhost:8080/images/toystory.jpg"),
                new Films(id++, "Tropa de Elite", "filme sobre o combate a criminalidade no Rio de Janeiro", 18, "http://localhost:8080/images/tropadeelite.jpg"),
                new Films(id++, "SmallVille", "Serie do SuperMan mais jovem", 14, "http://localhost:8080/images/smallville.jpg"),
                    new Films(id++, "Senhor dos Aneís", "filme sobre o senhor dos aneis", 16, "http://localhost:8080/images/senhordosaneis.jpg")
        );
    }
}
