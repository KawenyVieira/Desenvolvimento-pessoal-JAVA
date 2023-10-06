import java.util.Scanner;

import static java.lang.System.out;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.print("\nPor favor, digite o número da Número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        out.print("\nPor favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        out.print("\nPor favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        out.print("\nPor favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+numero+" e seu saldo de R$ "+saldo+" já está disponível para saque");
    }
}
