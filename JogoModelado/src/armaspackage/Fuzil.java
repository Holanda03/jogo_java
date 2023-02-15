package armaspackage;

public class Fuzil extends ArmaDeFogo{
    private int qtdMunicao = 15;

    public int getQtdBalas() {
        return qtdMunicao;
    }

    @Override
    public void usarArma()
    {
        if(qtdMunicao > 0)
        {
            System.out.println("Utilizando um fuzil.");
            qtdMunicao = qtdMunicao - 1;
        } else
        {
            System.out.println("Você está sem balas. Recarregue imediatamente usando recarregar()");
        }
    }

    @Override
    public void recarregar()
    {
        qtdMunicao = 15;
        System.out.println("Fuzil recarregado.");
    }
}
