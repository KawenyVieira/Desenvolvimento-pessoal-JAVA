/*   DESCRIÇÃO
    CONDICIONAL TERNARIA
 */

import java.util.Scanner;

public class ResultadoEscolar3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a nota do aluno");
        int nota = ler.nextInt();

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
