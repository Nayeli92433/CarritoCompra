import java.util.Scanner;

public class Pagar implements Funciones {
    Compra compra=new Compra();
    Scanner scanner= new Scanner(System.in);

    @Override
    public int proceso() {
        int costoCompra = compra.proceso();
        System.out.println("-----------------------------------------");
        System.out.println("       *****METODO DE PAGO+*****");
        System.out.println("-----------------------------------------");
        System.out.println("Si desa pagar en Efectivo ingrese [1]");
        System.out.println("Si desa pagar en con Tarjeta ingrese [2]");
        int formaPago = scanner.nextInt();
        System.out.println("-----------------------------------------");
        double IVA = costoCompra * 0.16;
        double costoMasIva = IVA + costoCompra;
        System.out.println("IVA del producto: " + IVA);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

        if (formaPago == 1) {

            System.out.println("El precio final es de " + costoMasIva);

        } else {
            double comision = costoCompra * 0.5;
            if (costoCompra < 800) {
                double costoComision = costoMasIva + comision;
                System.out.println("El precio final con comision es de " + costoComision);
                System.out.println("-----------------------------------------");
            } else {
                System.out.println("El precio final es de " + costoMasIva);
                System.out.println("-----------------------------------------");
            }
        }

        return costoCompra;
    }}



