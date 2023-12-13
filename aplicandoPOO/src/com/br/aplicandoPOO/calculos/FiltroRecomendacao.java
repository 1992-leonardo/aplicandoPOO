package com.br.aplicandoPOO.calculos;
public class FiltroRecomendacao {
    private String recomendacao;
    public void filtra(ClassificavelInterface classificavel) {
        if (classificavel.getClassificacaoFilme() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacaoFilme() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }

}
