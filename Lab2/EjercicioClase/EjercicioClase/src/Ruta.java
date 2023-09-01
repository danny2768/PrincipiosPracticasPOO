public class Ruta {
    public int id;
    public String[] paradas = new String[100];
    public int cantidadParadas;
    public Ruta( int id){
        this.id = id;
        cantidadParadas = 0;

    }

    public void agregarParada(String parada) {
        paradas[cantidadParadas] = parada;
        cantidadParadas ++;
    }

    public void imprimirRuta(){
        System.out.println("**** Ruta a  seguir ****");
        for(int i = 0; i < cantidadParadas; i++){
            System.out.println("* --> " + paradas[i]);

        }
    }
}
