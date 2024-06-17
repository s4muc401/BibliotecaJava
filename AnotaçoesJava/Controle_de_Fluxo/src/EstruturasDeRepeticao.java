import java.util.Scanner;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Estrutura While
        int i = 0;
        while (i <= 5) {
            // Estrutura for
            System.out.print("Numero para contagem: ");
            int num = leitura.nextInt();

            for (int iterador = 0; iterador <= num; iterador++) {
                System.out.println("Contando: " + iterador);
            }
            System.out.println("FIM DA CONTAGEM!");
            System.out.println("-------------------------------------------------");
        }
    }
}
