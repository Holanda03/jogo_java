package armaspackage;

public class Faca extends ArmaBranca{
    private int qtdGolpes = 3;
    private int dano = 4;

    public int getQtdGolpes()
    {
        return qtdGolpes;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void recuperarFolego(){
        if(qtdGolpes == 3){
            throw new RuntimeException("Você já está com a capacidade máxima de golpes de faca.");
        } else{
            qtdGolpes = 3;
            System.out.println("Fôlego recuperado.");
        }
    }
}