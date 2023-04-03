import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        cocheChange(coche, coche.velocidad);
        cocheChange(coche, coche.velocidad);
        cocheChange(coche, coche.velocidad);
        cocheDes(coche);
        System.out.println(coche.velocidad);
        factorial(8);

        Moto moto = new Moto();
        motoGo(moto);
        System.out.println(moto.velocidad);
    }


    public static int suma(int a, int b) {

        return a + b;
    }
    public static int factorial(int numero) {
        int resultado;
        if (numero == 1) {
            return 1;
        }
        resultado = factorial(numero - 1) * numero;
        return resultado;
    }
    public static void cocheChange(Coche coche, int a) { // funcion recibe objeto Coche y un valor
        coche.velocidad += 50;
        System.out.println(coche.velocidad);
    }
    public static void cocheDes(Coche coche) { // funcion recibe objeto
        coche.velocidad += 50;
        System.out.println(coche.velocidad);
    }
    public static void motoGo(Moto moto) { // funcion recibe objeto
        moto.velocidad += 50;
        System.out.println(moto.velocidad);
    }
}
    interface Vehiculo {

        void Acelerar(int cuantaVelocidad);

        void Frenar(int cuantaVelocidad);
    }


class Coche implements Vehiculo {
    int velocidad = 0;
    private void Velocidad(int cuantaVelocidad)  {
        System.out.println("Estoy velocidad");
    }
    @Override
    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Estoy acelerando");
    }

    @Override
    public void Frenar(int cuantaVelocidad) {
        System.out.println("Estoy frenando");
    }
}
class Moto implements Vehiculo {
    int velocidad = 0;
    @Override
    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Estoy acelerando");
    }

    @Override
    public void Frenar(int cuantaVelocidad) {
        System.out.println("Estoy frenando");
    }
}

