package personagenspackage;

public class Mago extends PersoTerrestres  {
    private int vida = 30;

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void desenhar() {
        System.out.println("desenhar(): Mago");
    }


    @Override
    public void falar(String mensagem) {
        System.out.println("Mensagem do Mago: " + mensagem);
    }


    @Override
    public void correr() {
        System.out.println("O Mago decidiu correr. Sua magia não é tão poderosa assim...");
    }
}
