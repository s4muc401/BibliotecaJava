package br.principal;

import br.modelo.MinhasPreferidas;
import br.modelo.Musica;
import br.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("hug");
        minhaMusica.setCantor("gess");

        for (int i = 0; i < 1000;i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50;i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("RebCrow");
        meuPodcast.setApresentador("R3B");

        for (int i = 0; i < 1000;i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 500;i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodcast);
    }
}
