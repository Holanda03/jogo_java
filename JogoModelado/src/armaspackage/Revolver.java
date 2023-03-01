package armaspackage;

public class Revolver extends ArmaDeFogo{
    private int qtdMunicao = 5;
    private int dano = 6;

    public int getQtdMunicao() {
        return qtdMunicao;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void recarregar()
    {
        if(qtdMunicao == 5){
            throw new RuntimeException("Você já está com a capacidade máxima de balas do revólver.");
        } else{
            qtdMunicao = 5;
            System.out.println("Revólver recarregado.");
        }
    }
}