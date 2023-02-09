package personagenspackage;

import personagenspackage.interfaces.iCorrer;
import personagenspackage.interfaces.iFalar;

public class Mago extends Personagem implements iFalar, iCorrer {
    @Override
    public void desenhar() {
        System.out.println("desenhar(): Mago");
    }

    @Override
    public void falar(String mensagem)
    {
        System.out.println("Mensagem do Mago: " + mensagem);
    }

    @Override
    public void correr()
    {
        System.out.println("O Mago decidiu correr. Sua magia não é tão poderosa assim...");
    }
}
