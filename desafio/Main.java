import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo = 2500;

        Scanner leitor = new Scanner(System.in);

        int opcaoDesejada = 0;

        while (opcaoDesejada != 4) {

            System.out.println("""
                    Operações
                                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """);

            opcaoDesejada = leitor.nextInt();

            if (opcaoDesejada == 1) {
                System.out.println("O saldo atual é R$ " + saldo);
            }

            if (opcaoDesejada == 2) {
                System.out.println("Informe o valor a receber: ");
                double valorAReceber = leitor.nextDouble();
                saldo += valorAReceber;
                System.out.println("Saldo atualizado R$ " + saldo);
            }

            if (opcaoDesejada == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double valorATransferir = leitor.nextDouble();

                if (valorATransferir > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                } else {
                    saldo -= valorATransferir;
                    System.out.println("Saldo atualizado R$ " + saldo);
                }
            }


        }
    }
}
