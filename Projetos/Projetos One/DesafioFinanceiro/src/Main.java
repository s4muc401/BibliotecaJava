import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "Matheus Samuel";
        String tipoDaConta = "corrente";
        double saldo = 1599.00;
        int opcao = 0;

        System.out.println("*****************************************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoDaConta);
        System.out.println("Saldo da Conta" + saldo);
        System.out.println("*****************************************");

        Scanner leitura = new Scanner((System.in));
        while (opcao != 4) {
            System.out.println("** Digite sua Opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Receber valor");
            System.out.println("4 - Sair\n Opção: ");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O Saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.print("Qual valor deseja Depositar: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não a saldo para realizar a transferencia");
                } else {
                    saldo -= valor;
                    System.out.println("Novo Saldo" + saldo);
                }
            } else if (opcao == 3) {
                System.out.print("Valor Recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo Saldo" + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção Invalida!");
            }
        }
    }
}