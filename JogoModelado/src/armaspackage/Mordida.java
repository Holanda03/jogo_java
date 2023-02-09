package armaspackage;

import armaspackage.interfaces.iForcaBruta;

public class Mordida extends Armaif implements iForcaBruta {
    private int qtdMordidas = 3;

    public int getQtdMordidas() {
        return qtdMordidas;
    }

    @Override
    public void usarArma()
    {
        if(qtdMordidas > 0)
        {
            System.out.println("Utilizando a Mordida - Dragão Alado.");
            qtdMordidas = qtdMordidas - 1;
        } else
        {
            System.out.println("Você está cansado para morder alguém. Descanse utilizando descansar()");
        }
    }

    @Override
    public void descansar()
    {
        qtdMordidas = 3;
        System.out.println("Personagem descansado. Pode voltar a batalha agora.");
    }
}
