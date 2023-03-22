
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
abstract class    Vehiculo {
    String matricula;
    String sonido;
    int velocidadMaxima;
    public  Vehiculo(){
    System.out.println("Estoy en vehiculo");
}
    public  String getSonido() {
        return this.getSonido();
    }
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

}
class Coche extends Vehiculo {

}
class Moto extends Vehiculo {

}