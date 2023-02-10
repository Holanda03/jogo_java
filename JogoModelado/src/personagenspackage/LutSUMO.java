package personagenspackage;


public class LutSUMO extends PersoTerrestres {

    public void desenhar()
    {
        System.out.println("desenhar(): Lutador de Sumo.");
    }


    public void falar(String mensagem)
    {
        System.out.println("Mensagem do Lutador de Sumo: " + mensagem);
    }


    public void correr()
    {
        System.out.println("Lutador de sumo decidiu correr, mas o homem é lento...");
    }
}

