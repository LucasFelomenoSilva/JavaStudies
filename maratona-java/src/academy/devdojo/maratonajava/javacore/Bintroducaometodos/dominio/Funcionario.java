package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

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

        for(double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial R$" + media );
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
