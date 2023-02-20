package armaspackage;

import personagenspackage.Personagem;

public class Desarmado extends Armaif{
    @Override
    public void usarArma(Personagem personagemPresa)
    {
        System.out.println("Utilizando nenhuma arma(desarmado)");
    }
}
