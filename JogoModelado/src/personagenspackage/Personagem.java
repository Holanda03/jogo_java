package personagenspackage;
import armaspackage.Armaif;
import armaspackage.Desarmado;

public abstract class Personagem {
    protected String nome;
    protected Armaif arma = new Desarmado();
    protected int vida;

    public Armaif getArma() {
        return arma;
    }

    public void setArma(Armaif arma) {
        this.arma = arma;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        return nome + " " + arma + " " + getVida();
    }

    public abstract void desenhar();

    public void arma(Personagem personagemPresa) {
        if (personagemPresa.getVida() > 0){
            arma.usarArma(personagemPresa);
            System.out.println("");
            System.out.println("O personagem " + this.getClass() + " atacou o personagem " + personagemPresa.getClass());
            System.out.println("");
            if (personagemPresa.getVida() <= 0){
                System.out.println("O personagem " + this.getClass() +" matou o personagem " + personagemPresa.getClass());
                System.out.println("");
                personagemPresa = null;
            } else {
                personagemPresa.setVida(personagemPresa.getVida() - arma.getDano());
                System.out.println("A vida do personagem " + personagemPresa.getClass() + " agora é " + personagemPresa.getVida());
                System.out.println("");
            }
        } else {
            System.out.println("Personagem está morto.");
        }
    }
}