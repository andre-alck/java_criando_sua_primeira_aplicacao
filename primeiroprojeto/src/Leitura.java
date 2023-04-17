package src;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = leitor.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = leitor.nextInt();

        System.out.println("Digite a avaliação: ");
        double avaliacao = leitor.nextDouble();

        System.out.println(filmeFavorito);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

        leitor.close();
    }
}
