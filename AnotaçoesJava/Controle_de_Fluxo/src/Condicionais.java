import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Infome sua idade: ");
        int idade = scanner.nextInt();

        // Estrutura simples
        if (idade > 18) {
            System.out.println("Tu é maior de idade");
        } else {
            System.out.println("Tu é menor de idade");
        }

        System.out.print("Informe sua nota: ");
        float nota = scanner.nextFloat();

        // Estrutura Else-If
        if (nota >= 10) {
            System.out.println("OTIMO!");
        } else if (nota >= 8 & nota < 10) {
            System.out.println("MUITO BOM!");
        } else if (nota >= 6 & nota <= 8) {
            System.out.println("BOM!");
        } else {
            System.out.println("ruim!");
        }

        // Estrutura Swicth
        int diaDaSemana = scanner.nextInt();
        String nomeDoDia;
        System.out.println("Infome o dia da Semana");

        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda";
                break;
            case 3:
                nomeDoDia = "Terça";
                break;
            case 4:
                nomeDoDia = "Quarta";
                break;
            case 5:
                nomeDoDia = "Quinta";
                break;
            case 6:
                nomeDoDia = "Sexta";
                break;
            case 7:
                nomeDoDia = "Sabado";
                break;
            default:
                nomeDoDia = "Dia Invalido";

        }
        System.out.println("O dia da semana é: " + nomeDoDia);
    }
}