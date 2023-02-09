package armaspackage;

import armaspackage.interfaces.iArmasDeFogo;

public class Revolver extends Armaif implements iArmasDeFogo {
    private int qtdBalas = 5;

    public int getQtdBalas() {
        return qtdBalas;
    }

    @Override
    public void usarArma()
    {
        if(qtdBalas > 0)
        {
            System.out.println("Utilizando um Revólver.");
            qtdBalas = qtdBalas - 1;
        } else
        {
            System.out.println("Você está sem balas. Recarregue imediatamente usando recarregar()");
        }
    }

    @Override
    public void recarregar()
    {
        qtdBalas = 5;
        System.out.println("Revólver recarregado.");
    }
}
