import java.util.Scanner;
public class Metodos {
    Scanner sc = new Scanner(System.in);

    public objVehiculo [] LlenarRegistros(objVehiculo[] r)
    {
        for (int i = 0; i < r.length; i++) {
            objVehiculo  o = new objVehiculo(); //nombre del objeto "o"
            System.out.println("ingrese la marca: ");
            o.setMarca(sc.nextLine());
            System.out.println("Ingrese el tipo de vehiculo: ");
            o.setTipo(sc.nextLine());
            System.out.println("Ingrese el cilindraje: ");
            o.setCilindraje(sc.nextInt());
            
            if (o.getCilindraje() > 900 && o.getCilindraje() <1700) {
                o.setPagoAnterior(150000);
            }
            else if (o.getCilindraje() >1700 && o.getCilindraje() < 2000) {
                o.setPagoAnterior(200000);
            }
            else{
                o.setPagoAnterior(250000);
            }
            o.setNumeroCelda(i+1);
            r[i]=o;
            sc.nextLine();
        }
        return r;
    }

    public objVehiculo [] CalcularPago (objVehiculo[] r)
    {
        for (int i = 0; i < r.length; i++) {
            r[i].setPagoActual(r[i].getPagoAnterior()*.23 + r[i].getPagoAnterior());
        }
        return r;
    }
    
    public void MostrarRegistros (objVehiculo[] r)
    {
        for (int i = 0; i < r.length; i++) {
            System.out.println("Marca:" + r[i].getMarca() + "\n" + "Tipo: " + r[i].getTipo() + "\n" + "Cilindraje: " + r[i].getCilindraje()+ "\n" + "Pago Anterior: " + r[i].getPagoAnterior() + "\n" + "Pago Actual: " + r[i].getPagoActual());
            System.out.println("=========================================");
        }
    }
}

