package personagenspackage;

public class General extends PersoTerrestres {
    protected int vida = 35;

    public General(String nome) {
        this.nome = nome;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void desenhar() {
        System.out.println("desenhar(): General.");
    }

    @Override
    public void falar(String mensagem) {
        System.out.println("Mensagem do General: " + mensagem);
    }

    @Override
    public void correr() {
        System.out.println("General está correndo da batalha. Um líder cagão.");
    }
}