package armaspackage;

import personagenspackage.Personagem;

public abstract class Armaif {
    private int dano;

    public abstract void usarArma(Personagem personagemPredador, Personagem personagemPresa);
}
