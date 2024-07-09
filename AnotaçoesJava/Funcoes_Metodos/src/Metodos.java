public class Metodos {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Antes de chamar o método: " + num); // 10
        modificarValor(num);
        System.out.println("Depois de chamar o método: " + num); // 10

        int[] array = {1,2,3};
        System.out.println("Antes de chamar o método: " + array[0]); // 1
        modificarArray(array);
        System.out.println("Depois de chamar o método: " + array[0]); // 10

        System.out.println(somar(1,7));

        Pessoa pessoa = criarPessoa("Reb", 12);
        System.out.println(pessoa.nome+pessoa.idade);
    }

    public static Pessoa criarPessoa(String nome, int idade) {
        return new Pessoa(nome,idade);
    }

    public static class Pessoa {
        String nome;
        int idade;

        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }


    // PARAMETROS PRIMITIVOS
    public static void modificarValor(int valor) {
        valor = 20;
    }

    public static void modificarArray(int[] arr) {
        arr[0] = 10;
    }

    public static int somar(int a, int b) {
        return a + b;
    }

}

