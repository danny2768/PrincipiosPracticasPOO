import java.util.Scanner;

public class Servicio {
    public Muestra[] simples;
    public Muestra[] especializadas;


    public Servicio(String serial, int profundidad, String fecha){
        simples = new Muestra[30];
        especializadas = new Muestra[30];
    }

    // ! Agregar validacion de si quedan espacios vacios
    public void agregarMuestra(Muestra muestra){
        if (muestra.getProfundidad() <= 10) {

            for (int i = 0; i < simples.length; i++) {
                if (simples[i] == null) {
                    simples[i] = muestra;
                    System.out.println("Muestra agregada al vector simples.");
                    return;
                }
            }

        } else if (muestra.getProfundidad() > 10 && muestra.getProfundidad() <= 30) {
            for (int i = 0; i < especializadas.length; i++) {
                if (especializadas[i] == null) {
                    especializadas[i] = muestra;
                    System.out.println("Muestra agregada al vector especializadas.");
                    return;
                }
            }


        } else {
            System.out.println("Profundidad no valida para clasificar muestra.");
            System.out.print("\nIngrese una nueva profundidad:\t");

            Scanner sc = new Scanner(System.in);
            muestra.setProfundidad(sc.nextInt());
        }


    }
}
