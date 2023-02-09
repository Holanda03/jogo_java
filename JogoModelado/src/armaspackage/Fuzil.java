package armaspackage;

import armaspackage.interfaces.iArmasDeFogo;

public class Fuzil extends Armaif implements iArmasDeFogo {
    private int qtdBalas = 15;

    public int getQtdBalas() {
        return qtdBalas;
    }

    @Override
    public void usarArma()
    {
        if(qtdBalas > 0)
        {
            System.out.println("Utilizando um fuzil.");
            qtdBalas = qtdBalas - 1;
        } else
        {
            System.out.println("Você está sem balas. Recarregue imediatamente usando recarregar()");
        }
    }

    @Override
    public void recarregar()
    {
        qtdBalas = 15;
        System.out.println("Fuzil recarregado.");
    }
}
