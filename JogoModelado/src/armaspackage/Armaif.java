package armaspackage;

import personagenspackage.Personagem;

public abstract class Armaif {
    private int dano;

    public int getDano() {
        return dano;
    }

    public abstract void usarArma(Personagem personagemPresa);
}
