import armaspackage.*;
import personagenspackage.DragaoAlado;
import personagenspackage.General;
import personagenspackage.Mago;
import personagenspackage.Soldado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Instanciando alguns personagens:");
        Soldado soldado = new Soldado();
        General general = new General();
        Mago mago = new Mago();
        DragaoAlado dragao = new DragaoAlado();
        System.out.println("");

        System.out.println("Instanciando algumas armas:");
        Fuzil fuzil = new Fuzil();
        Revolver revolver = new Revolver();
        Magia magia = new Magia();
        Mordida mordida = new Mordida();
        System.out.println("");

        System.out.println("Adicionando as armas aos personagens:");
        soldado.setArma(fuzil);
        general.setArma(revolver);
        mago.setArma(magia);
        dragao.setArma(mordida);
        System.out.println("");

        System.out.println("Utilizando métodos:");
        dragao.voar();
        general.correr();
        //general.arma();
        //mago.arma();
        //dragao.arma();
        //dragao.arma();
        //dragao.arma();
        //dragao.arma();
        soldado.arma(soldado, general);
        System.out.println(mordida.getQtdMordidas());
        mordida.descansar();
        //general.arma();
        System.out.println(revolver.getQtdBalas());
        revolver.recarregar();
        System.out.println(revolver.getQtdBalas());
        mago.falar("General, você não será palho para mim.");
        soldado.desenhar();
    }
}
