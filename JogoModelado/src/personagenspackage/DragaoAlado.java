package personagenspackage;

public class DragaoAlado extends PersoAereos {

    @Override
    public void desenhar() {
        System.out.println("desenhar(): Dragão Alado");
    }

    @Override
    public void voar() {
        System.out.println("O Dragão Alado decidiu voar para longe do perigo.");
    }
}
