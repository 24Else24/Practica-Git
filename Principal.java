import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int n = 0;

        System.out.println("Ingrese la dimension del patio: ");
        n = sc.nextInt();

        objVehiculo[] r = new objVehiculo[n];
        r = m.LlenarRegistros(r);
        r = m.CalcularPago(r);
        m.MostrarRegistros(r);

    }
}