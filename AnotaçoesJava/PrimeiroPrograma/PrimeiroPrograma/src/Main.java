public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Top Gun - Marevich");

        int anoDeLancamento = 2020;
        System.out.println("Ano de Lançamento:" + anoDeLancamento);
        double notaDoFilme = 8.1;
        boolean incluidoNoPlano = false;
        double media = (9.0 + 3.6 + 10) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de Aventura de um galã dos anos 80";
        System.out.println(sinopse);
        int diasParaAssistir = 10;
        System.out.println(String.format("Voçe tem exatamente: %s",diasParaAssistir));
        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}