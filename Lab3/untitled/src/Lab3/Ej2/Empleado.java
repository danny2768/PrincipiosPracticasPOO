package Lab3.Ej2;

public class Empleado {
    private String nombre;
    private String direccion;

    public Empleado(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters y setters para nombre y direccion

    // Método para imprimir detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
    }
}
