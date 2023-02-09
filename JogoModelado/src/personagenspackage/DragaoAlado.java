package personagenspackage;

import personagenspackage.interfaces.iVoar;

public class DragaoAlado extends Personagem implements iVoar {
    @Override
    public void desenhar()
    {
        System.out.println("desenhar(): Dragão Alado");
    }

    @Override
    public void voar()
    {
        System.out.println("O Dragão Alado decidiu voar para longe do perigo.");
    }
}
