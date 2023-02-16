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
    public void usarArma(Personagem personagemAlvo)
    {
        if(qtdMunicao > 0)
        {
            System.out.println("Utilizando um fuzil.");
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
