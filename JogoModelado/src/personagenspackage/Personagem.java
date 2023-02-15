package personagenspackage;

import armaspackage.Armaif;

public abstract class Personagem {
    private Armaif arma;

    public abstract void desenhar();

    public void arma() {
        arma.usarArma();
    }

    public void setArma(Armaif arma) {
        this.arma = arma;
    }
}
