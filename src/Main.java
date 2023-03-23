
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import java.awt.event.WindowStateListener;
import java.security.PublicKey;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
    Coche coche = new Coche();
    coche.imprime();
    }
}
    class    Vehiculo {
        public void imprime() {
            System.out.println("Estoy en vehiculo");
        }
    }
    class Coche extends Vehiculo {

                 public void imprime() {

                      System.out.println("Estoy en cochde");
                  }
    }

