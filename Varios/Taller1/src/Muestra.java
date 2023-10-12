public class Muestra {
    private String serial;
    private int profundidad;
    private String fecha;

    public Muestra(String serial, int profundidad, String fecha){
        this.serial = serial;
        this.profundidad = profundidad;
        this.fecha = fecha;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public String getSerial() {
        return serial;
    }

    public String getFecha() {
        return fecha;
    }
}
