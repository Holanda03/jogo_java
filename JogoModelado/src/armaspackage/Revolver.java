package armaspackage;

public class Revolver extends ArmaDeFogo{
    private int qtdMunicao = 5;
    private int dano = 6;

    public int getQtdMunicao() {
        return qtdMunicao;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void recarregar()
    {
        qtdMunicao = 5;
        System.out.println("Revólver recarregado.");
    }
}
