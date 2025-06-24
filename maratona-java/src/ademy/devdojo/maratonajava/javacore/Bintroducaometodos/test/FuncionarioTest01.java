package ademy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import ademy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Lucas";
        funcionario.idade = 22;
        funcionario.salarios = new double[]{};

        funcionario.imprimeFuncionario();

    }
}
