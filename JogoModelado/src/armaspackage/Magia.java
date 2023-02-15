package armaspackage;

public class Magia extends Poderes{
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
    public void recuperarPoder()
    {
        qtdMana = 25;
        System.out.println("Mana restaurada.");
    }
}
