package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Faculdade;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Universitario;

public class FaculdadeTest01 {
    public static void main(String[] args){
        Faculdade faculdade = new Faculdade("PUC");
        Universitario universitario = new Universitario("Lucas");

        Universitario[] universitarios = {universitario};

        faculdade.setUniversitarios(universitarios);
        universitario.setFaculdade(faculdade);

        faculdade.imprime();
    }
}
