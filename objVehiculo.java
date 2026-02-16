public class objVehiculo {
    private String Marca;
    private String Tipo;
    private int Cilindraje;
    private double PagoAnterior;
    private double PagoActual;
    private int NumeroCelda;
    
    public objVehiculo(String marca, String tipo, int cilindraje, double pagoAnterior, double pagoActual,
            int numeroCelda) {
        Marca = marca;
        Tipo = tipo;
        Cilindraje = cilindraje;
        PagoAnterior = pagoAnterior;
        PagoActual = pagoActual;
        NumeroCelda = numeroCelda;
    }

    public objVehiculo() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }

    public double getPagoAnterior() {
        return PagoAnterior;
    }

    public void setPagoAnterior(double pagoAnterior) {
        PagoAnterior = pagoAnterior;
    }

    public double getPagoActual() {
        return PagoActual;
    }

    public void setPagoActual(double pagoActual) {
        PagoActual = pagoActual;
    }

    public int getNumeroCelda() {
        return NumeroCelda;
    }

    public void setNumeroCelda(int numeroCelda) {
        NumeroCelda = numeroCelda;
    }

    
}
