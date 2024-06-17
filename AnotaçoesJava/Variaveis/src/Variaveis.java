// OQUE SÃO: Pequenos espaços na memoria que guardam dados do seu programa.
import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {
        // DECLARAÇÃO DE UMA VARIAVEL
        String nome;
        int idade = 13;
        long idadeDoPai = 49;
        int idadeDaMae;
        double altura = 1.75;
        char genero = 'M';
        boolean estudante = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        nome = scanner.nextLine();
        System.out.print("Digite a idade da Mãe do Aluno: ");
        idadeDaMae = scanner.nextInt();

        // IMPRESÃO
        System.out.println(nome+idade+idadeDoPai+idadeDaMae+genero+altura+estudante);
    }
}
