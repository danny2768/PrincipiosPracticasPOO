import java.util.Scanner;

public class Laboratorio {
    private Servicio[] servicios;

    public Laboratorio(){
        servicios = new Servicio[100];
    }

    public boolean hayEspacioVacio(Servicio[] arreglo) {
        for (Servicio servicio : arreglo) {
            if (servicio == null) {
                return true;
            }
        }
        return false;
    }

    public void agregarServicio(Servicio servicio){
        if ( hayEspacioVacio(servicios)) {
            for (int i = 0; i < servicios.length; i++) {
                if (servicios[i] == null) {
                    servicios[i] = servicio;
                    System.out.println("Servicio agregado.");
                    return;
                }
            }
        } else {
            System.out.println("No hay espacio en el vector para agregar el servicio.");
        }
    }

    public void registrarMuestra(Muestra muestra, int indiceServicio) {
        if (indiceServicio >= 0 && indiceServicio <= 99) {
            Servicio servicio = servicios[indiceServicio];

            if (servicio != null) {
                servicio.agregarMuestra(muestra);
                System.out.println("Muestra registrada en el servicio: " + indiceServicio);
            } else {
                System.out.println("El servicio " + indiceServicio + " no existe.");
            }
        } else {
            System.out.println("Numero de servicio fuera de rango (debe estar entre 0 y 99).");
        }
    }

    public void mostrarInformeLaboratorio() {
        for (int i = 0; i < servicios.length; i++) {
            Servicio servicio = servicios[i];
            if (servicio != null) {
                Muestra[] muestrasEspecializadas = servicio.getEspecializadas();
                Muestra[] muestrasSimples = servicio.getSimples();


                double profPromEspecializadas = calcularProfundidadPromedio(muestrasEspecializadas);
                double profPromSimples = calcularProfundidadPromedio(muestrasSimples);

                int costoTotal = calcularCostoTotal(muestrasEspecializadas.length, muestrasSimples.length);

                System.out.println("---------------");
                System.out.println("Servicio # " + i);
                System.out.println("Profundidad promedio " + muestrasEspecializadas.length + " muestras especializadas: " + profPromEspecializadas);
                System.out.println("Profundidad promedio " + muestrasSimples.length + " muestras simples: " + profPromSimples);
                System.out.println("Costo Total: " + costoTotal);
                System.out.println("---------------");
            }
        }
    }

    private double calcularProfundidadPromedio(Muestra[] muestras) {
        double sumaProfundidades = 0;
        int numMuestras = 0;

        for (Muestra muestra : muestras) {
            if (muestra != null) {
                sumaProfundidades += muestra.getProfundidad();
                numMuestras++;
            }
        }

        return numMuestras > 0 ? sumaProfundidades / numMuestras : 0;
    }

    private int calcularCostoTotal(int numEspecializadas, int numSimples) {
        int costoEspecializada = 1000000;
        int costoSimple = 400000;

        return (numEspecializadas * costoEspecializada) + (numSimples * costoSimple);
    }


}
