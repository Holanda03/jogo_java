package armaspackage;
import personagenspackage.Personagem;

public abstract class Poderes extends Armaif {
    private int qtdMana;

    @Override
    public void usarArma(Personagem personagemPresa) {
        if(qtdMana > 0) {
            qtdMana = qtdMana - 5;
        } else {
            throw new RuntimeException("Você está sem poder. Regenere imediatamente usando regenerar().");
        }
    }

    public abstract void recuperarPoder();
}