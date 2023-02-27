package armaspackage;

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
    public void recuperarPoder()
    {
        qtdMana = 25;
        System.out.println("Mana restaurada.");
    }
}
