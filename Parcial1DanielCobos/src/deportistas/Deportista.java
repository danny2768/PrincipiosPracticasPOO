package deportistas;

public abstract class Deportista {
    public String identificacion;

    public Deportista(String identificacion){
        this.identificacion=identificacion;
    }

    public abstract double cuotaAPagar();

    public String toString(){
        return "El valor pagado por: "+identificacion+" es: $"+cuotaAPagar()+" tipo de deportista "+this.getClass().getSimpleName();
    }
}
