import java.util.Scanner;

public class CastingPrimitivos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numint = 30;
        double numDouble = (double) numint;
        System.out.println(numDouble);

        // Conversão em valores ascii
        char letra = 'A';
        int letraEmFormatoAscii = (int) letra;
        System.out.println(letraEmFormatoAscii);

    }
}
