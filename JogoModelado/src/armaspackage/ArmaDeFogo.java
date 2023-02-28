package armaspackage;
import personagenspackage.Personagem;

public abstract class ArmaDeFogo extends Armaif {
    private int qtdMunicao;

    @Override
    public void usarArma(Personagem personagemPresa) {
        if(qtdMunicao > 0) {
            qtdMunicao = qtdMunicao - 1;
        }
        else {
            throw new RuntimeException("Você está sem balas. Recarregue imediatamente usando recarregar().");
        }
    }

    public abstract void recarregar();
}