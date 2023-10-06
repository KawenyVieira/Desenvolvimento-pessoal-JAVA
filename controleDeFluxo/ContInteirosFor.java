/*      DESCRIÇÃO
    CONTADOR DE INTEIROS UTILIZANDO ESTRUTURA DE REPETICAO FOR
 */
import java.util.Scanner;

public class ContInteirosFor {
    public static void main(String[] args) {

        Scanner cont = new Scanner(System.in);

        System.out.println("Digite o valor maximo para o contador");
            int max= cont.nextInt();
        System.out.println("Digite o valor minimo para o contador");
            int min= cont.nextInt();

        for(int contador = min ; contador <=max; contador ++) {
            System.out.println(contador );
        }
    }
}
