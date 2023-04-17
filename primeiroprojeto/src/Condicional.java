package src;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        String plano = "plus";

        if (anoDeLancamento > 2021 || plano.equals("plus")) {
            System.out.println("Liberado");
        } else {
            System.out.println("Bloqueado");
        }
    }
}