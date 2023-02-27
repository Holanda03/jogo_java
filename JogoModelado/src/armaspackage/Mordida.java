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
        qtdGolpes = 3;
        System.out.println("Mandibula descansada. Pode voltar a morder seus inimigos agora.");
    }
}
