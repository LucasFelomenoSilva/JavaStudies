import br.com.alura.screenmatch.modelos.*;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        System.out.println("\n-----------------------------------");

        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);

        System.out.println("\n-----------------------------------");

        Musica musica = new Musica();
        musica.titulo = "God's Plan";
        musica.artista = "Drake";
        musica.anoLancamento = 2018;
        musica.avalia(8);
        musica.avalia(9);
        musica.avalia(10);
        musica.fichaTecnica();
        System.out.println(musica.avaliacao);
        System.out.println(musica.numAvaliacoes);
        System.out.println(musica.media());

        System.out.println("\n-----------------------------------");

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2023;
        meuCarro.cor = "Preto";

        meuCarro.fichaTecnica();

        System.out.println("Idade do carro: " + meuCarro.calcularIdade() + " anos");

        System.out.println("\n-----------------------------------");

        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Lucas";
        meuAluno.idade = 21;

        meuAluno.exibeInformacoes();
    }
}

