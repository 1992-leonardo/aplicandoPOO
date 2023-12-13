package com.br.aplicandoPOO.modelos;

import com.br.aplicandoPOO.calculos.ClassificavelInterface;

public class Filme extends Titulo implements ClassificavelInterface {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    @Override
    public int getClassificacaoFilme() {
        return (int) pegaMedia() / 2;
    }
    @Override
    public String toString() {
        return "Filme: " + getNome() + ", Diretor: " + (diretor != null ? diretor : "Desconhecido") + ", Duração: " + getDuracaoMinutos() + " minutos";
    }
}
