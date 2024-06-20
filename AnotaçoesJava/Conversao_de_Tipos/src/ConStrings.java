import java.util.Scanner;

public class ConStrings {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("INFORME UM NUMERO DOUBLE: ");
        double numDouble = leitura.nextDouble();
        System.out.print("INFORME UM NUMERO INTEIRO: ");
        int numInt = leitura.nextInt();

        String strDouble = String.valueOf(numDouble);
        String strInt = String.valueOf(numInt);
        System.out.println("NUMERO DOUBLE INFORMADO: " + strDouble + " NUMERO INT INFORMADO: " + numInt + " AMBOS EM FORMATO DE STRING");

        System.out.println("DIGITE UM ENDEREÇO SIMPLES: ");
        String endereco = "R. Rcar 891";
        String numeroDoEndereco = endereco.replaceAll("[^0-9]", "");
        System.out.println(numeroDoEndereco);
        int enderecoEmInt = Integer.parseInt(numeroDoEndereco);
        System.out.println(enderecoEmInt);
    }
}
