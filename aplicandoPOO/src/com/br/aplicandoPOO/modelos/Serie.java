package com.br.aplicandoPOO.modelos;

public class Serie extends Titulo{

    private int temporadas;
    private boolean ativa;
    private int episodioTemporadas;
    private int minutosTemporadas;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioTemporadas() {
        return episodioTemporadas;
    }

    public void setEpisodioTemporadas(int episodioTemporadas) {
        this.episodioTemporadas = episodioTemporadas;
    }

    public int getMinutosTemporadas() {
        return minutosTemporadas;
    }

    public void setMinutosTemporadas(int minutosTemporadas) {
        this.minutosTemporadas = minutosTemporadas;
    }

    @Override
    public int getDuracaoMinutos(){
        return temporadas * episodioTemporadas * minutosTemporadas;
    }

}
