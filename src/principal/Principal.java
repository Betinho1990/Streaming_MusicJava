package principal;

import Modelos.Favoritas;
import Modelos.Musica;
import Modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Toxicity");
        minhaMusica.setCantor("System Of A Down");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Hipster");
        meuPodcast.setApresentador("Alura");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        Favoritas preferidas = new Favoritas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
