package personagenspackage;

import personagenspackage.interfaces.iCorrer;
import personagenspackage.interfaces.iFalar;

public class General extends Personagem implements iFalar, iCorrer {
    @Override
    public void desenhar()
    {
        System.out.println("desenhar(): General.");
    }

    @Override
    public void falar(String mensagem)
    {
        System.out.println("Mensagem do General: " + mensagem);
    }

    @Override
    public void correr()
    {
        System.out.println("General está correndo da batalha. Um líder cagão.");
    }
}