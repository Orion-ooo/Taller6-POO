
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Estudiante {
    public String nombre;
    public int edad;

    public Ej2_Estudiante() {
        this("sin nombre", 0);
    }

    public Ej2_Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarEstudiante(){
        System.out.println("nombre: " + nombre + " y edad: " + edad);
    }
}
