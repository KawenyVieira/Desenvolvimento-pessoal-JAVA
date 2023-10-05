/*   DESCRIÇÃO
    CONDICIONAL ENCADEADA
 */

import java.util.Scanner;
public class ResultadoEscolar2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("digite a nota do aluno");
        int nota = ler.nextInt();

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

    }
}
