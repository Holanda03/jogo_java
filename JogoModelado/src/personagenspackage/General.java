package personagenspackage;

public class General extends PersoTerrestres {

    public void desenhar()
    {
        System.out.println("desenhar(): General.");
    }

    public void falar(String mensagem)
    {
        System.out.println("Mensagem do General: " + mensagem);
    }

    public void correr()
    {
        System.out.println("General está correndo da batalha. Um líder cagão.");
    }
}
