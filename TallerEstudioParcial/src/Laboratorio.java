public class Laboratorio {
    private Servicio[] servicios;

    public Laboratorio() {
        servicios = new Servicio[100];
    }

    public void agregarServicios(Servicio servicio) {
        for (int i = 0 ; i < servicios.length ; i++) {
            if (servicios[i] == null){
                servicios[i] = servicio;
                System.out.println("El servicio ha sido agregado con exito.");
                return;
            }
        }
    }

    public void registrarMuestra(Muestra muestra, int indiceServicio) {
        if (indiceServicio >= 0 && indiceServicio <= 99) {
            Servicio servicio = servicios[indiceServicio];

            if (servicio == null)
                servicio.agregarMuestra(muestra);
                System.out.println("La muestra ha sido registrada en el servicio en el indice: " + indiceServicio);
        }else {
            System.out.println("Indice no valido. Intente nuevamente.");
            System.out.println("Indice debe estar entre 0 y 99");
        }

    }
}
