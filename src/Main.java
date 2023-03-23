
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import java.awt.event.WindowStateListener;
import java.security.PublicKey;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
    Coche coche = new Coche();
    coche.SumaNumeros(3.2, 4.5);

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
    public int SumaNumeros(int a, int b) {
        return a + b;
    }
    public float SumaNumeros(float a, float b) {
        return a + b * (float)9.0;
    }
    public void SumaNumeros(double a, double b) {
        System.out.println("El resultado es: " + (a + b));
     }
}

