package src;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double somaDasNotas = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Avaliação: ");
            nota = leitor.nextDouble();

            if (nota != -1) {
                somaDasNotas += nota;
                totalDeNotas++;
            }
        }
        double media = somaDasNotas / totalDeNotas;

        System.out.println("Média = " + media);
    }
}