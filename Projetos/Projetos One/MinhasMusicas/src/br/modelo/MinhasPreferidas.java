package br.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() > 8) {
            System.out.println(audio.getTitulo() + "ESTA ENTRE OS PREFERIDOS");
        } else {
            System.out.println(audio.getTitulo() + "ADICIONE NA SUA LISTA");
        }
    }
}
