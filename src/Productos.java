public class Productos {
        public static DatosProducto[] llenarArreglo() {
            DatosProducto[] arreglo = new DatosProducto[4];
            arreglo[0] = new DatosProducto("Pantalon", 400, 6);
            arreglo[1] = new DatosProducto("Sueter", 250, 8);
            arreglo[2] = new DatosProducto("Tenis", 700, 5);
            arreglo[3] = new DatosProducto("Playera", 150, 10);
            return arreglo;
        }
    }


