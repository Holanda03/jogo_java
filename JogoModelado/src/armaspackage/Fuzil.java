package armaspackage;

import personagenspackage.Personagem;

public class Fuzil extends ArmaDeFogo{
    private int qtdMunicao = 15;
    private int dano = 7;

    public int getQtdBalas() {
        return qtdMunicao;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void usarArma(Personagem personagemPredador, Personagem personagemPresa)
    {
        if(qtdMunicao > 0)
        {
            System.out.println("O personagem " + personagemPredador.getNome() + " atacou o personagem " + personagemPresa.getNome());
            personagemPresa.setVida(personagemPresa.getVida() - this.dano);
            System.out.println("A vida do personagem " + personagemPresa.getNome() + " agora é " + personagemPresa.getVida());
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
