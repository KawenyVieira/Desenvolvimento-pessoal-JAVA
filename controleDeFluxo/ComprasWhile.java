import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ComprasWhile {
    public static void main(String[] args) {
        
        Scanner val = new Scanner(System.in);

        System.out.println("Digite o valor que esta sendo levado para o mercado");
        double valor = val.nextDouble();
        
        while(valor>0) {
            Double valorItem = valorAleatorio();
            if(valorItem > valor)
                valorItem = valor;

            System.out.println("Item do valor: " + valorItem + " Adicionado no carrinho");
            valor = valor - valorItem;
        }
        System.out.println("valor:" + valor);
        System.out.println("Voce gastou todo o seu dinheiro, volte mes que vem");

    }

    //Gerando valores aleatorios
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
