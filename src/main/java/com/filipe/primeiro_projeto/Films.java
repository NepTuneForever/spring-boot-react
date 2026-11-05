package com.filipe.primeiro_projeto;

import lombok.Getter;
import lombok.Setter;

public class Films {
    public String titulo;
    public String descricao;
    @Getter @Setter
    private int classificacao;

    public Films(String titulo, String descricao, int classificacao)
    {
        this.titulo = titulo;
        this.descricao = descricao;
        this.classificacao = classificacao;
    }
}
