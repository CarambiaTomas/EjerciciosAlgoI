// Clase PruebaAlquiler
public class PruebaAlquiler {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 1000);
        Auto auto = new Auto("Ford", "Focus", 1200);
        Moto moto = new Moto("Yamaha", "FZ", 800);

        int dias = 5;

        System.out.println("Costo Vehículo: " + vehiculo.calcularCostoAlquiler(dias));
        System.out.println("Costo Auto: " + auto.calcularCostoAlquiler(dias));
        System.out.println("Costo Moto: " + moto.calcularCostoAlquiler(dias));
    }
}
