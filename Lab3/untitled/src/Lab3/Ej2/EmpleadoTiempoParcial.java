package Lab3.Ej2;

public class EmpleadoTiempoParcial extends Empleado {
    private int horasTrabajadas;

    public EmpleadoTiempoParcial(String nombre, String direccion, int horasTrabajadas) {
        super(nombre, direccion);
        this.horasTrabajadas = horasTrabajadas;
    }

    // Getter y setter para horasTrabajadas

    // Método para calcular el salario
    public double calcularSalario() {
        return horasTrabajadas * 10.0; // Supongamos un salario de $10 por hora
    }
}
