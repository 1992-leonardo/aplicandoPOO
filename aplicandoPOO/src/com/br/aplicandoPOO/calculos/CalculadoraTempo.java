package com.br.aplicandoPOO.calculos;

import com.br.aplicandoPOO.modelos.Titulo;
import com.br.aplicandoPOO.modelos.Serie;
import com.br.aplicandoPOO.modelos.Filme;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);

        if (titulo instanceof Serie) {
            Serie serie = (Serie) titulo;
            this.tempoTotal += serie.getDuracaoMinutos();
        } else if (titulo instanceof Filme) {
            Filme filme = (Filme) titulo;
            this.tempoTotal += filme.getDuracaoMinutos();
        }
    }

    @Override
    public String toString() {
        return "CalculadoraTempo{" +
                "tempoTotal=" + tempoTotal +
                '}';
    }
}
