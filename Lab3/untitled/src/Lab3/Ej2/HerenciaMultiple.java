package Lab3.Ej2;

public class HerenciaMultiple {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Calle A");
        Empleado empleado2 = new EmpleadoTiempoCompleto("Ana", "Calle B", 5000);
        Empleado empleado3 = new EmpleadoTiempoParcial("Pedro", "Calle C", 20);

        Empleado[] empleados = {empleado1, empleado2, empleado3};

        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();

            if (empleado instanceof EmpleadoTiempoCompleto) {
                EmpleadoTiempoCompleto empleadoTiempoCompleto = (EmpleadoTiempoCompleto) empleado;
                System.out.println("Salario: $" + empleadoTiempoCompleto.calcularSalario());
            } else if (empleado instanceof EmpleadoTiempoParcial) {
                EmpleadoTiempoParcial empleadoTiempoParcial = (EmpleadoTiempoParcial) empleado;
                System.out.println("Salario: $" + empleadoTiempoParcial.calcularSalario());
            }

            System.out.println();
        }
    }
}