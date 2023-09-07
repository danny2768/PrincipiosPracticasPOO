public class Muestra {
    public String serial;
    public int profundidad;
    public String fecha;

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
}
