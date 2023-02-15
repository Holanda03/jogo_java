package armaspackage;

public class Faca extends ArmaBranca{
    private int qtdGolpes = 3;

    public int getQtdGolpes()
    {
        return qtdGolpes;
    }

    @Override
    public void usarArma()
    {
        if(qtdGolpes > 0)
        {
            System.out.println("Utilizando uma faca.");
            qtdGolpes = qtdGolpes - 1;
        } else
        {
            System.out.println("Você está sem fôlego. Recupere imediatamente usando recuperarFolego()");
        }
    }

    @Override
    public void recuperarFolego(){
        qtdGolpes = 3;
        System.out.println("Fôlego recuperado.");
    }
}
