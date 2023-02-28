package armaspackage;
import personagenspackage.Personagem;

public abstract class ArmaBranca extends Armaif {
    private int qtdGolpes;

    @Override
    public void usarArma(Personagem personagemPresa) {
        if(qtdGolpes > 0) {
            qtdGolpes = qtdGolpes - 1;
        } else {
            throw new RuntimeException("Você está sem fôlego. Recupere imediatamente usando recuperarFolego().");
        }
    }

    public abstract void recuperarFolego();
}