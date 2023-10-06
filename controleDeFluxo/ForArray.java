/*      DESCRIÇÃO
    LEITURA DE UM ARRAY UTILIZANDO ESTRUTURA DE REPETICAO FOR
 */
public class ForArray {
    public static void main(String[] args) {
        String alunos[] = { "Joao", "Maria", "Jose", "EspiritoSanto" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

    }
}
