package com.br.aplicandoPOO.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodioTemporada;
    private int minutoEpisodio;
    private int minutosTemporada;

    public int getMinutosTemporada() {
        return minutosTemporada;
    }

    public void setMinutosTemporada(int minutosTemporada) {
        this.minutosTemporada = minutosTemporada;
    }

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

    public int getEpisodioTemporada() {
        return episodioTemporada;
    }

    public void setEpisodioTemporada(int episodioTemporada) {
        this.episodioTemporada = episodioTemporada;
    }

    public int getMinutosEpisodio() {
        return minutoEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutoEpisodio = minutosEpisodio;
    }

    @Override
    public int getDuracaoMinutos() {
        return temporadas * episodioTemporada * minutoEpisodio;
    }
    @Override
    public String toString() {
        return "Série: " + getNome() + ", Temporadas: " + getTemporadas() + ", Minutos por temporada: " + getMinutosTemporada();
    }
}