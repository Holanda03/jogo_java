package armaspackage;

public class Mordida extends ForcaBruta {
    private int qtdGolpes = 3;

    public int getQtdMordidas() {
        return qtdGolpes;
    }

    @Override
    public void usarArma()
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
