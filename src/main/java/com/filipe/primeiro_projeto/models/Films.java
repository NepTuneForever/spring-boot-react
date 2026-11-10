package com.filipe.primeiro_projeto.models;

import lombok.Getter;
import lombok.Setter;

public class Films {
    public String image;
    public String titulo;
    public String descricao;
    @Getter @Setter
    private int classificacao;
    @Getter @Setter
    private int id;

    public Films(int id, String titulo, String descricao, int classificacao, String image)
    {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.classificacao = classificacao;
        this.image = image;
    }
}
