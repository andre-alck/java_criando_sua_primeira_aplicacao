package src;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediaDaAvalicao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Avaliação:");
            nota = leitor.nextDouble();
            mediaDaAvalicao += nota;
        }
        mediaDaAvalicao /= 3;

        System.out.println("Média = " + mediaDaAvalicao);
    }
}
