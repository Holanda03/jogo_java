package armaspackage;

import personagenspackage.Personagem;

public class Revolver extends ArmaDeFogo{
    private int qtdMunicao = 5;
    private int dano = 6;

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
            System.out.println("Utilizando um Revólver.");
            qtdMunicao = qtdMunicao - 1;
        } else
        {
            System.out.println("Você está sem balas. Recarregue imediatamente usando recarregar()");
        }
    }

    @Override
    public void recarregar()
    {
        qtdMunicao = 5;
        System.out.println("Revólver recarregado.");
    }
}
