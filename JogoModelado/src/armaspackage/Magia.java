package armaspackage;

import personagenspackage.Personagem;

public class Magia extends Poderes{
    private int qtdMana = 25;
    private int dano = 5;

    public int getQtdMana() {
        return qtdMana;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void usarArma(Personagem personagemAlvo) {
        if(qtdMana > 0)
        {
            System.out.println("Utilizando a Magia - Mago.");
            qtdMana = qtdMana - 5;
        } else
        {
            System.out.println("Você está sem mana. Regenere ela imediatamente usando regenerar()");
        }
    }

    @Override
    public void recuperarPoder()
    {
        qtdMana = 25;
        System.out.println("Mana restaurada.");
    }
}
