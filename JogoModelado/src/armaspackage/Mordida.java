package armaspackage;

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
    public void descansar()
    {
        if(qtdGolpes == 3){
            throw new RuntimeException("Você já está com a capacidade máxima de mordidas.");
        } else{
            qtdGolpes = 3;
            System.out.println("Mordida descansada.");
        }
    }
}