import java.util.ArrayList;

public class ContenedorTriangulos {
    public Triangulo[] lista;
    public int cantidad;

    public ArrayList<Triangulo> arrTriangulos;

    public ContenedorTriangulos() {
        lista = new Triangulo[50];
        cantidad = 0;

        arrTriangulos = new ArrayList<>();
    }
    
    public void agregarTriangulo(Triangulo t) {

        if (!validarExistencia(t)) {
            lista[cantidad] = t;
            cantidad ++;
        } else {
            System.out.println("Error");
        }
    }

    public boolean validarExistencia(Triangulo t) {
        boolean exito = false;
        for (int i = 0; i < cantidad; i++){
            if(t.equals(lista[i])) {
                exito = true;
                break;
            }
        }
        return exito;
    }

    public void AgregarTrianguloV2(Triangulo t){
        arrTriangulos.add(t);

    }

}
