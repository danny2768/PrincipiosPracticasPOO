public class Servicio {
    private Muestra[] simples;
    private Muestra[] especializadas;

    public Servicio() {
        simples = new Muestra[30];
        especializadas = new Muestra[30];
    }

    public void agregarMuestra(Muestra muestra) {
        if (muestra.getProfundidad() <= 10){
            for (int i = 0 ; i < simples.length ; i++) {
                if (simples[i] == null){
                    simples[i] = muestra;
                    System.out.println("La muestra ha sido agregada con exito.");
                    return;
                }
            }
        } else if (muestra.getProfundidad() >= 11 && muestra.getProfundidad() <= 50) {
            for (int i = 0 ; i < especializadas.length ; i++) {
                if (especializadas[i] == null){
                    especializadas[i] = muestra;
                    System.out.println("La muestra ha sido agregada con exito.");
                    return;
                }
            }
        } else {
            System.out.println("La muestra no tiene una profundidad valida. Por favor verifiquela:");
            System.out.print(muestra.getProfundidad());
        }
    }

    public Muestra[] getSimples() {
        return simples;
    }

    public Muestra[] getEspecializadas() {
        return especializadas;
    }
}
