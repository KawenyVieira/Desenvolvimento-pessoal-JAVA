/*
    Desafio: Você foi contratado por um banco para desenvolver um programa que auxilie seus clientes
a realizar depósitos em suas contas. O programa deve solicitar ao cliente o valor do depósito e
verificar se o valor é válido. Se o valor for maior do que zero, o programa deve adicionar o
valor ao saldo da conta. Caso contrário, o programa deve exibir uma mensagem de erro. O programa
deve soliticar apenas uma vez o valor de depósito.

    Entrada
    O programa deve utilizar o Scanner para receber o valor de depósito digitado pelo cliente.
Os valor pode ser decimal, representando valor em reais.

    Saída
    O programa deve exibir uma mensagem de sucesso quando um valor de depósito válido for informado
e o saldo da conta for atualizado. Se o valor for "0", deverá imprimir uma mensagem encerrando o
programa. Caso um valor inválido seja digitado, o programa deve exibir uma mensagem de erro
solicitando um novo valor.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.00");

        double valor = scanner.nextDouble();

        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            System.out.println("Deposito realizado com sucesso!\n" + "Saldo atual: "+ df.format(valor));
        } else if (valor < 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else {
            //TODO: Imprimir a mensagem de encerrar o programa.
            System.out.println("Encerrando o programa...");

        }
    }
}
