import java.util.Scanner;

/*                                              DESCRICAO
    Para esse desafio, considere que você foi contratado por uma empresa bancária para auxiliar
nas implementações e melhorias do sistema empresarial. Em uma análise inicial, foi identificado
pela equipe financeira a necessidade de desenvolver uma solução que permita ao cliente equilibrar
seu saldo bancário. Dessa forma, o programa deve solicitar uma entrada que representa o saldo atual
do funcionário, e após, seja informado o valor de duas transações, sendo elas: um depósito e um
saque. O programa deve atualizar o saldo com base nas transações e exibir o saldo final.

    Informação: As transações de depósito e retirada devem ser tratadas como valores positivos e
negativos, respectivamente, para garantir que o cálculo do saldo final seja realizado corretamente.

    Entrada
    saldoAtual: um número decimal representando o saldo atual da conta bancária. valorDeposito: um número
decimal representando o valor a ser depositado na conta. valorRetirada: um número decimal representando
o valor a ser retirado da conta.

    Regra de Formatação: Considere apenas uma casa decimal para esse desafio.

    Saída
    Um número decimal que representa o saldo atualizado na conta bancária após o processamento das transações.
 */

public class Equilibrando_Saldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        saldoAtual += valorDeposito - valorRetirada;

        // Imprime o saldo atualizado com uma casa decimal
        System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtual);
        scanner.close();
    }
}
