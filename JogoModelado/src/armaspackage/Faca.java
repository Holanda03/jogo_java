package armaspackage;

import personagenspackage.Personagem;

public class Faca extends ArmaBranca{
    private int qtdGolpes = 3;
    private int dano = 4;

    public int getQtdGolpes()
    {
        return qtdGolpes;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void usarArma(Personagem personagemAlvo)
    {
        if(qtdGolpes > 0)
        {
            System.out.println("Utilizando uma faca.");
            qtdGolpes = qtdGolpes - 1;
        } else
        {
            System.out.println("Você está sem fôlego. Recupere imediatamente usando recuperarFolego()");
        }
    }

    @Override
    public void recuperarFolego(){
        qtdGolpes = 3;
        System.out.println("Fôlego recuperado.");
    }
}
