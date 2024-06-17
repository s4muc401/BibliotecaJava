import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        double media = 0;
        double nota = 0;
        Scanner leitura = new Scanner(System.in);

        for (int i = 0; i < 3;i++) {
            System.out.print("Qual sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            media += nota;
        }

        System.out.println("Média de avaliações: " + media/3);
    }
}
