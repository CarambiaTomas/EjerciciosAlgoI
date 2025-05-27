// Clase Auto
public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, double precioBase) {
        super(marca, modelo, precioBase);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return super.calcularCostoAlquiler(dias) * 1.2;
    }
}
