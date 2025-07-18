package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Minima: : " + Carro.velocidadeLimite);
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome(){
        return this.nome;
    }
    public double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
