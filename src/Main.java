
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import java.awt.event.WindowStateListener;
import java.security.PublicKey;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
    Coche coche = new Coche();
    }
}
    class    Vehiculo {

        int velocidadMaxima;

        public Vehiculo() {
            System.out.println("Estoy en vehiculo");
        }
    }
    class Motor extends Vehiculo {
                   String tipomotor;
                   public Motor() {
                       System.out.println("Estoy en motor");
                   }
    }
   class Coche extends  Motor {
}
