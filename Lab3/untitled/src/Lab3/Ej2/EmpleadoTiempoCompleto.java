package Lab3.Ej2;

public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String direccion, double salarioMensual) {
        super(nombre, direccion);
        this.salarioMensual = salarioMensual;
    }

    // Getter y setter para salarioMensual

    // Método para calcular el salario
    public double calcularSalario() {
        return salarioMensual;
    }
}
