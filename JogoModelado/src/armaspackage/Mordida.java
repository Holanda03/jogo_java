package armaspackage;

import personagenspackage.Personagem;

public class Mordida extends ForcaBruta {
    private int qtdGolpes = 3;
    private int dano = 10;

    public int getQtdMordidas() {
        return qtdGolpes;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void usarArma(Personagem personagemPredador, Personagem personagemPresa)
    {
        if(qtdGolpes > 0)
        {
            System.out.println("Utilizando a Mordida - Dragão Alado.");
            qtdGolpes = qtdGolpes - 1;
        } else
        {
            System.out.println("Você está cansado para morder alguém. Descanse utilizando descansar()");
        }
    }

    @Override
    public void descansar()
    {
        qtdGolpes = 3;
        System.out.println("Personagem descansado. Pode voltar a batalha agora.");
    }
}
