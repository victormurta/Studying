import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float cash = 2500;
        float change;
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        java.lang.String name = "João da Silva";
        java.lang.String account = "Conta Corrente";

        System.out.printf("""
                ******************************
                Nome do Cliente: %s
                Tipo de conta: %s
                Saldo:%.2f
                ******************************
                """,name,account,cash);

        while (input != 4){
            System.out.println("""
                    Escolha uma operação:
                    1 - Consultar Saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Finalizar
                    """);
            input = scanner.nextInt();

            switch (input){
                case 1:
                    System.out.printf("Saldo disponível de: %.2f\n", cash);
                    break;

                case 2:
                    System.out.println("Insira o valor que será recebido: ");
                    change = scanner.nextFloat();
                    cash += change;
                    System.out.printf("Saldo disponível de: %.2f\n", cash);
                    break;

                case 3:
                    System.out.println("Insira o valor que será transferido: ");
                    change = scanner.nextFloat();
                    if (cash < change)
                        System.out.println("Saldo insuficiente");
                    else
                        cash -= change;
                    System.out.printf("Saldo disponível de: %.2f\n", cash);
                    break;
            }
        }
    }
}