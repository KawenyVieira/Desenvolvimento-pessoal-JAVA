/*   DESCRIÇÃO
    CONDICIONAL SIMPLES
 */

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do saldo");
        double saldo = ler.nextInt();
        System.out.println("Digite o valor solicitado");
        double valorSolicitado = ler.nextInt();

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}
