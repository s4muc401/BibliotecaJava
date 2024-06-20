import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------------------------------------");
            System.out.print(" DIGITE O CARACTER QUE DESEJA TRANSFERIR (LETRA OU NUMERO): ");
            String caracter = leitura.nextLine();
            try {
                int numeroOuLetra = Integer.parseInt(caracter);
                char letraDoNumero = (char) numeroOuLetra;
                System.out.println(" O CODIGO DO SEU NUMERO EM ASCII É: " + letraDoNumero);
            } catch (NumberFormatException e) {
                if (caracter.length() == 1) {
                    char letraInformada = caracter.charAt(0);
                    int codigoDaLetra = (int) letraInformada;
                    System.out.println(" O CODIGO DA SUA LETRA EM ASCII É: " + codigoDaLetra);
                } else {
                    System.out.println("INFORME APENAS UM (1) CARACTER");
                }
            }
        }
    }
}
