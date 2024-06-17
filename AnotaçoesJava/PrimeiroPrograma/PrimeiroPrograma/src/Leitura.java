import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu filme Favorito: ");
        String filme = leitura.nextLine();
        System.out.print("Digite o ano de Lançamento do Filme: ");
        int anoDeLancamento = leitura.nextInt();
        System.out.print("Digite a sua nota: ");
        double notaParaFilme = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(notaParaFilme);
    }
}
