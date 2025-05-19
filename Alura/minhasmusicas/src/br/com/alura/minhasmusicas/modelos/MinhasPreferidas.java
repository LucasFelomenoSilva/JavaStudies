package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio a){
        if (a.getClassificacao() >= 9) {
            System.out.println(a.getTitulo() + " é considerado sucesso absoluto e preferido por todos");
        } else {
            System.out.println(a.getTitulo() + " , é melhor ouvir depois ...");
        }
    }
}
