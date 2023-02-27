package armaspackage;

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
    public void recuperarFolego(){
        qtdGolpes = 3;
        System.out.println("Fôlego recuperado.");
    }
}
