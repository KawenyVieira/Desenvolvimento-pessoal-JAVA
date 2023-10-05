/*   DESCRIÇÃO
    CONDICIONAL COMPOSTA
 */

import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da nota");
        int nota = ler.nextInt();

        if(nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");
    }
}
