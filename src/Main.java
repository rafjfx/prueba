
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import java.awt.event.WindowStateListener;
import java.security.PublicKey;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
    Coche coche = new Coche();
    coche.setSonido("BRRR");
    System.out.println(coche.getSonido());
    }
}
abstract class    Vehiculo { // clase vehiculo tiene dos funciones abstractas
    String sonido;
    int velocidadMaxima;

    public Vehiculo() {
        System.out.println("Estoy en vehiculo");
    }

    abstract public String getSonido();

    abstract public void setSonido(String sonido);

}
class Coche extends Vehiculo { // clase coche hereda de vehiculo
    public String getSonido() { // implementa las clase abstracta
        return "Sonido coche " + this.sonido;
    }
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
class Moto extends Vehiculo { // clase moto hereda de vehiculo
    public String getSonido() { // implementa las clase abstracta
                return "Sonido moto " + this.sonido;
    }
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
