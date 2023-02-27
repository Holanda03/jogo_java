package personagenspackage;

public class DragaoAlado extends PersoAereos {
    private int vida = 40;

    public DragaoAlado(String nome) {
        this.nome = nome;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void desenhar() {
        System.out.println("desenhar(): Dragão Alado");
    }

    @Override
    public void voar() {
        System.out.println("O Dragão Alado decidiu voar para longe do perigo.");
    }
}