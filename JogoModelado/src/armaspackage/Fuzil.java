package armaspackage;
import personagenspackage.Personagem;

public class Fuzil extends ArmaDeFogo{
    private int qtdMunicao = 15;
    private int dano = 7;

    public int getQtdMunicao() {
        return qtdMunicao;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void usarArma(Personagem personagemPresa)
    {
        if(qtdMunicao > 0)
        {

            qtdMunicao = qtdMunicao - 1;
        } else
        {
            System.out.println("Você está sem balas. Recarregue imediatamente usando recarregar()");
        }
    }

    @Override
    public void recarregar()
    {
        qtdMunicao = 15;
        System.out.println("Fuzil recarregado.");
    }
}