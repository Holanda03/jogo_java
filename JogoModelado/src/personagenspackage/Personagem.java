package personagenspackage;

import armaspackage.Armaif;

public abstract class Personagem {
    private String nome;
    private String tipoPersonagem;
    private Armaif arma;
    private int vida;

    public void setArma(Armaif arma) {
        this.arma = arma;
    }

    public int getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoPersonagem() {
        return tipoPersonagem;
    }

    public abstract void desenhar();

    public void arma(Personagem personagemAlvo) {
        arma.usarArma(personagemAlvo);
    }
}
