package ademy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeFuncionario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null){
            return;
        }

        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Salário " + i + " R$" + this.salarios[i]);
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario(){
        if (salarios == null){
            return;
        }

        double media = 0;

        for(double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial R$" + media );
    }
}
