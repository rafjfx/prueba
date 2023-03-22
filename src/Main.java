import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import java.awt.event.WindowStateListener;
import java.security.PublicKey;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        //       Cochee cochee = new Coche(5,0);
        //        System.out.println(coche.numeroDePuertas);
        //      System.out.println(coche.velocidadActual);
        //       while (coche.velocidadActual < 20) {
        //          coche.acelerar();
        //           System.out.println(coche.velocidadActual);
        //}
        //      Coche coche2 = new Coche();
        //       System.out.println(coche2.numeroDePuertas);
        //       System.out.println(coche2.velocidadActual);
        //      coche.decelerar();
        //      System.out.println(coche2.velocidadActual);

        Vehiculo coche = new Vehiculo();
        coche.setTipo("Coupe");

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scooter");
        coche.setVelocidadMaxima(120);
        coche.setRapido(true);
        System.out.println(coche.getTipo());
        System.out.println(moto.getTipo());
        System.out.println(coche.getVelocidadMaxima());
        System.out.println(coche.isRapido());
        //       String tipo = coche.getTipo();
        //      System.out.println(tipo);
    }
}
class   Vehiculo {
    private String tipo;
  //  public void setTipo(String valor) {
    private int velocidadMaxima;
    private boolean rapido;
    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }
    public boolean isRapido() {
        return this.rapido;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }

  //  public String getTipo() {
   //     return this.tipo;
   // }
}
class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche() {
        System.out.println("sin parametros");
    }

    public Coche(int puertas, int velocidad) {
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("estoy en el constructor");
    }
};
//    public void acelerar() {
//        velocidadActual += 5;
//    }
//    public void decelerar() {velocidadActual -= 5; }

