package armaspackage;

public class Fuzil extends ArmaDeFogo{
    private int qtdMunicao = 15;
    private int dano = 7;

    public int getQtdMunicao() {
        return qtdMunicao;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void recarregar() {
        if(qtdMunicao == 15){
            throw new RuntimeException("Você já está com a capacidade máxima de balas do fuzil.");
        } else{
            qtdMunicao = 15;
            System.out.println("Fuzil recarregado.");
        }
    }
}