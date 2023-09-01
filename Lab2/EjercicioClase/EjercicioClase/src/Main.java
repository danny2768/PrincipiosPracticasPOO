public class Main {
    public static void main(String[] args) {

        Carro unCarro = new Carro("Spark", 2013);
        Carro otroCarro = new Carro("Clio", 2012, 255, 0, 0);

        Ruta ruta = new Ruta(1);
        ruta.agregarParada("UIS");
        ruta.imprimirRuta();

//        Crear objetos y que el carro siga la ruta procurando que cada clase haga lo que le corresponda.
//        Vehiculo modelo tal, color tal va a seguir la ruta tal. (imprimir RGB del carro)


    }

}