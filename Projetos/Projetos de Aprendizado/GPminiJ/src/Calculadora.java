import java.util.Scanner;

public class Calculadora {
    Scanner leitura = new Scanner(System.in);

    public void Calcular() {
        System.out.println("\nCALCULADORA\n");

        double num1, num2 = 0;
        double number = 0;
        String check = "";
        while (!check.equalsIgnoreCase("SAIR")) {
            System.out.print("INFORME O PRIMEIRO NUMERO: ");
            num1 = leitura.nextDouble();
            try {
                System.out.print("ESCOLHA A OPERAÇÃO (+ - x /): ");
                String operacao = leitura.next();

                System.out.print("INFORME O SEGUNDO NUMERO: ");
                num2 = leitura.nextDouble();

                try {
                    if (operacao.equals("+")) {
                        number = num1 + num2;
                        System.out.println(number);
                    } else if (operacao.equals("-")) {
                        number = num1 - num2;
                        System.out.println(number);
                    } else if (operacao.equals("x")) {
                        number = num1 * num2;
                        System.out.println(number);
                    } else if (operacao.equals("/")) {
                        number = num1 / num2;
                        System.out.println(number);
                    } else {
                        System.out.println("[ERRO] Operação Invalida!");
                    }

                    System.out.print("DESEJA CONTINUAR? ");
                    check = leitura.nextLine();
                } catch (NumberFormatException e) {
                    System.out.println("[ERRO] Digite um numero!");
                }
            } catch (NumberFormatException e) {
                System.out.println("[ERRO] Digite um numero!");
            }
        }
    }
}
