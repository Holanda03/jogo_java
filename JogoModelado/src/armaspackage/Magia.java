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
        if(qtdMana == 25){
            throw new RuntimeException("Você já está com a quantidade máxima de mana.");
        } else{
            qtdMana = 25;
            System.out.println("Mana regenerada.");
        }
    }
}