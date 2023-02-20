package personagenspackage;

import armaspackage.Armaif;

public abstract class Personagem {
    private String nome;
    private String tipoPersonagem;
    private Armaif arma;
    protected int vida;

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

    public String getTipoPersonagem() {
        return tipoPersonagem;
    }

    public abstract void desenhar();

    public void arma(Personagem personagemPresa) {
        arma.usarArma(personagemPresa);
        System.out.println("");
        System.out.println("O personagem " + this.getClass() + " atacou o personagem " + personagemPresa.getClass());
        personagemPresa.setVida(personagemPresa.getVida() - arma.getDano());
        System.out.println("A vida do personagem " + personagemPresa.getClass() + " agora é " + personagemPresa.getVida());
        System.out.println("");
    }
}
