package armaspackage;

import armaspackage.interfaces.iMana;

public class Magia extends Armaif implements iMana {
    private int qtdMana = 25;

    public int getQtdMana() {
        return qtdMana;
    }

    @Override
    public void usarArma() {
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
    public void regenerar()
    {
        qtdMana = 25;
        System.out.println("Mana restaurada.");
    }
}
