package personagenspackage;

import personagenspackage.interfaces.iCorrer;
import personagenspackage.interfaces.iFalar;

public class Soldado extends Personagem implements iFalar, iCorrer {
    @Override
    public void desenhar()
    {
        System.out.println("desenhar(): Soldado.");
    }

    @Override
    public void falar(String mensagem)
    {
        System.out.println("Mensagem do Soldado: " + mensagem);
    }

    @Override
    public void correr()
    {
        System.out.println("O soldado decidiu correr da batalha. Deve ser um recruta ainda.");
    }
}
