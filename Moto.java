// Clase Moto
public class Moto extends Vehiculo {

    public Moto(String marca, String modelo, double precioBase) {
        super(marca, modelo, precioBase);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return super.calcularCostoAlquiler(dias) * 0.85;
    }
}
