public class DatosProducto {
    private String nombre;
    private int precio;
    private int cantidadProducto;

    public DatosProducto(String nombre, int precio, int cantidadProducto){
        this.nombre= nombre;
        this.precio= precio;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }


}