package ademy.devdojo.maratonajava.javacore.Hheranca.test;

import ademy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import ademy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import ademy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args){
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("3598622");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("1111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
