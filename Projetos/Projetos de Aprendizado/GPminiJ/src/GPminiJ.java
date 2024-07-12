import java.util.Objects;
import java.util.Scanner;

public class GPminiJ {
    public static void main(String[] args) {
        Scanner leitura = new Scanner((System.in));

        while (true) {
            System.out.print("""
            [MENU FUNÇÕES GPMINI]
           
            [0] CADERNO
            [1] CALCULADORA
            [2] CONVERSOR
            [3] VENDAS
            
            DIGITE SUA OPÇÃO: """);
            var opcao = leitura.nextLine();

            if (Objects.equals(opcao, "0")) {
                Caderno caderno = new Caderno();
                caderno.Anotacao();
            } else if (Objects.equals(opcao, "1")) {
                Calculadora calculo = new Calculadora();
                calculo.Calcular();
            } else if (Objects.equals(opcao, "2")) {
                System.out.println("\nCONVERSOR\n");

            } else if (Objects.equals(opcao, "3")) {
                System.out.println("\nVENDAS\n");

            } else {
                System.out.println("""
                [ERRO]
                
                INSIRA UM NUMERO VALIDO DE ACORDO COM O MENU.\n\n
                """);
            }
        }
    }
}
