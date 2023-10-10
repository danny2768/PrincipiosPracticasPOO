package empleados;

public class EmpleadoTemporal extends  Empleado{
    public EmpleadoTemporal(String nombre, String apellido, float baseSalarial, int anios) {
        super(nombre, apellido, baseSalarial, anios);
    }

    @Override
    public double calcularSalario() {
        return 2.5 * getBaseSalarial()-(getBaseSalarial()*0.286);
    }



}
