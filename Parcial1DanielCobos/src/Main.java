import deportistas.Adolescente;
import deportistas.Adulto;
import deportistas.Nino;
import services.impl.Escuela;

public class Main {
    public static void main(String[] args){
        Escuela e= new Escuela("Talents Players");
        e.agregarDeportista(new Nino("123456"));
        e.agregarDeportista(new Adolescente("654321",14));
        e.agregarDeportista(new Adolescente("789654",17));
        e.agregarDeportista(new Adulto("456987",true));
        e.agregarDeportista(new Adulto("741258",false));
        e.imprimirListaDeCuotas();
    }
}
