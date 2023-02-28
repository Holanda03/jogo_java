package armaspackage;
import personagenspackage.Personagem;

public abstract class ForcaBruta extends Armaif {
    private int qtdGolpes;

    @Override
    public void usarArma(Personagem personagemPresa) {
        if(qtdGolpes > 0) {
            qtdGolpes = qtdGolpes - 1;
        } else {
            throw new RuntimeException("Você está cansado para bater em alguém. Descanse utilizando descansar().");
        }
    }

    public abstract void descansar();
}