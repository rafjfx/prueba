import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import java.awt.event.WindowStateListener;
import java.security.PublicKey;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.velocidadMaxima = 14;
        cocheElectrico.matricula = "ABC 1234";
        System.out.println(cocheElectrico.compruebaMatricula("ABC 1234"));
    }
}
class   Vehiculo {
    String matricula;
    int velocidadMaxima;

    public boolean compruebaMatricula(String matricula) {
        if (matricula == "ABC 1234") {
            return true;
        }
        return false;
    }


}
class Coche extends Vehiculo {

}
class CocheElectrico extends Vehiculo {

}