
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import java.awt.event.WindowStateListener;
import java.security.PublicKey;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
    }
    Coche coche = new Coche();

}

interface  Vehiculo {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo {
    public void Acelerar(int cuantaVelocidad) {

    }

    @Override
    public void Frenar(int cuantaVelocidad) {

    }
}