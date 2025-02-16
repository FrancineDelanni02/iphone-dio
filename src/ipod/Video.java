package ipod;

import functions.Reprodutor;

public class Video implements Reprodutor {
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo vídeo");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando vídeo");
    }

    @Override
    public void voltar() {
        System.out.println("Voltando vídeo");
    }

    @Override
    public void avancar() {
        System.out.println("Avancando video");
    }
}
