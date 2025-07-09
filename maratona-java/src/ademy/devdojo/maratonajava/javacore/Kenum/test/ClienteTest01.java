package ademy.devdojo.maratonajava.javacore.Kenum.test;

import ademy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import ademy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import ademy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
