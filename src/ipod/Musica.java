package ipod;

import functions.Reprodutor;

public class Musica implements Reprodutor {
    private String titulo;
    private String artista;

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void voltar() {
        System.out.println("Voltando música");
    }

    @Override
    public void avancar() {
        System.out.println("Avançando música");
    }
}
