package personagenspackage;

public class Mago extends PersoTerrestres  {

    public void desenhar() {
        System.out.println("desenhar(): Mago");
    }


    public void falar(String mensagem)
    {
        System.out.println("Mensagem do Mago: " + mensagem);
    }


    public void correr()
    {
        System.out.println("O Mago decidiu correr. Sua magia não é tão poderosa assim...");
    }
}
