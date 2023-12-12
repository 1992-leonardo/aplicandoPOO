package com.br.aplicandoPOO.calculos;

import com.br.aplicandoPOO.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duracao em minutos de " + titulo);
    }

}
