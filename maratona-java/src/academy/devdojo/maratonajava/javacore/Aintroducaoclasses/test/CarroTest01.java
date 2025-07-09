package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;


import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String [] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Civic";
        carro1.modelo = "Si";
        carro1.ano = 2008;

        carro2.nome = "Siena";
        carro2.modelo = "Fire";
        carro2.ano = 2008;

//        carro1 = carro2;

        System.out.println("Carro 1: ");
        System.out.println("Nome: " + carro1.nome + " \nModelo: " + carro1.modelo + " \nAno: " + carro1.ano);
        System.out.println("\n-----\n");
        System.out.println("Carro 2: ");
        System.out.println("Nome: " + carro2.nome + " \nModelo: " + carro2.modelo + " \nAno: " + carro2.ano);
    }
}
