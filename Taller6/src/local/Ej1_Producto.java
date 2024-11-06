
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_Producto {
    public String nombre;
    public double precio;

    public Ej1_Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void mostrarProducto(){
        System.out.println("nombre: " + nombre + " y precio: " + precio);
    }
}
