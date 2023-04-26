import java.util.Scanner;

public class Compra implements Funciones{

    Scanner scanner = new Scanner(System.in);

    @Override
    public int proceso() {
        DatosProducto[] productos = Productos.llenarArreglo();

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto #" + (i+1) + ":");
            System.out.println("Nombre: " + productos[i].getNombre());
            System.out.println("Precio: " + productos[i].getPrecio());
            System.out.println("Cantidad: " + productos[i].getCantidadProducto());
            System.out.println("--------------------");
        }

        System.out.println("Ingrese el número del producto que desea comprar:");
        int nomProducto = scanner.nextInt();
        System.out.println("Ingrese la cantidad de productos que desea comprar:");
        int cantidadProducto = scanner.nextInt();

        // Verificar si la cantidad solicitada está disponible
        DatosProducto productoElegido = productos[nomProducto - 1];
        int cantidadDisponible = productoElegido.getCantidadProducto();
        int costoCompra=productoElegido.getPrecio() * cantidadProducto;
        if (cantidadDisponible >= cantidadProducto) {
            System.out.println("Pedido realizado con éxito: " + cantidadProducto + " " + productoElegido.getNombre() + " por $" + costoCompra);
            return costoCompra;
        } else {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Lo sentimos, no hay suficientes productos disponibles");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

            System.exit(0);

        }


        int restantes= cantidadDisponible-cantidadProducto;
        System.out.println("Productos en existencia "+ restantes);
        return nomProducto;

    }
}










