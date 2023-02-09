package personagenspackage;

import personagenspackage.interfaces.iCorrer;
import personagenspackage.interfaces.iFalar;

public class LutSUMO extends Personagem implements iFalar, iCorrer {
    @Override
    public void desenhar()
    {
        System.out.println("desenhar(): Lutador de Sumo.");
    }

    @Override
    public void falar(String mensagem)
    {
        System.out.println("Mensagem do Lutador de Sumo: " + mensagem);
    }

    @Override
    public void correr()
    {
        System.out.println("Lutador de sumo decidiu correr, mas o homem é lento...");
    }
}

