package Modelos;

public class Favoritas {

    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado um grande sucesso" +
                    " e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " todo mundo está " +
                    "curtindo");
        }
    }
}
