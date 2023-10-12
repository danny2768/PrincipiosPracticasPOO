public class Muestra {
    private String serial;
    private int profundidad;
    private String fecha;

    public Muestra(String serial, int profundidad, String fecha) {
        this.serial = serial;
        this.profundidad = profundidad;
        this.fecha = fecha;
    }

    public String getSerial() {
        return serial;
    }

    public String getFecha() {
        return fecha;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
