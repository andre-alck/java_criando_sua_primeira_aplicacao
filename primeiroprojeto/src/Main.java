package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");

        System.out.println("Filme: \"Top Gun: Maverick\"");

        String sinopse = """
                Filme de aventura
                2022
                """;
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3) / 2;
        int classificacao = (int) media / 2;
        System.out.println(classificacao);
    }
}