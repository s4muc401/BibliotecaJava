import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;
        Scanner leitura = new Scanner(System.in);

        while(nota != -1) {
            System.out.print("Qual sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliações: " + media/totalDeNotas);
    }
}
