package armaspackage;


public class Revolver extends ArmaDeFogo{
    private int qtdMunicao = 5;

    public int getQtdBalas() {
        return qtdMunicao;
    }

    @Override
    public void usarArma()
    {
        if(qtdMunicao > 0)
        {
            System.out.println("Utilizando um Revólver.");
            qtdMunicao = qtdMunicao - 1;
        } else
        {
            System.out.println("Você está sem balas. Recarregue imediatamente usando recarregar()");
        }
    }

    @Override
    public void recarregar()
    {
        qtdMunicao = 5;
        System.out.println("Revólver recarregado.");
    }
}
