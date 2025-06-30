package ademy.devdojo.maratonajava.javacore.Gassociacao.test;

import ademy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import ademy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import ademy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args){
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor professor3 = new Professor("Might Guy Sensei");

        Professor[] professores = {professor1, professor2, professor3};

        Aluno aluno1 = new Aluno("Naruto");
        Aluno aluno2 = new Aluno("Saske");

        Aluno[] alunos = {aluno1, aluno2};

        Escola escola = new Escola("Konoha", professores, alunos);

        escola.imprime();
    }
}
