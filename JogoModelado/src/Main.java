import armaspackage.*;
import personagenspackage.Soldado;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Instanciando um personagem:");
            Soldado soldado1 = new Soldado("Alexandre");
            System.out.println(soldado1.getArma());

            System.out.println("Instanciando uma arma:");
            Fuzil fuzil1 = new Fuzil();
            soldado1.setArma(fuzil1);
            System.out.println(soldado1.getArma());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}