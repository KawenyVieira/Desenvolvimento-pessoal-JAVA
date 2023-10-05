/*      DESCRIÇÃO
       SWITCH CASE
 */

import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sigla para saber o tamanho por extenso");
        String sigla = ler.next();

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
