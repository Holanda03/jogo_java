package personagenspackage;

public class Soldado extends PersoTerrestres {

    public void desenhar()
    {
        System.out.println("desenhar(): Soldado.");
    }


    public void falar(String mensagem)
    {
        System.out.println("Mensagem do Soldado: " + mensagem);
    }


    public void correr()
    {
        System.out.println("O soldado decidiu correr da batalha. Deve ser um recruta ainda.");
    }
}
