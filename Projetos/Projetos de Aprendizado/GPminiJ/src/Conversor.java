import java.util.Scanner;

public class Conversor {
    Scanner leitura = new Scanner(System.in);

    public void Converter() {
        // Recebe a Informação
        var quantidadeMaterial = leitura.nextDouble();
        try {
            System.out.print("QUE MATERIAL IRA CONVERTER: (UNIDADE/)");
            var tipoDeConversao = leitura.nextLine();

            if (tipoDeConversao.equalsIgnoreCase())
        } catch (NumberFormatException e) {
            System.out.println("Digite corretamente");
        }

        // Escolha do tipo de conversão
        // Realizar a conversão e calcular preços
    }
}
