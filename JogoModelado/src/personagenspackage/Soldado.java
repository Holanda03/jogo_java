package personagenspackage;

public class Soldado extends PersoTerrestres {

    @Override
    public void desenhar() {
        System.out.println("desenhar(): Soldado.");
    }


    @Override
    public void falar(String mensagem) {
        System.out.println("Mensagem do Soldado: " + mensagem);
    }


    @Override
    public void correr() {
        System.out.println("O soldado decidiu correr da batalha. Deve ser um recruta ainda.");
    }
}
