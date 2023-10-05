import enums.EDescuento;
import services.impl.CarteraImpl;
import tarjetas.Joven;
import tarjetas.Nomina;
import tarjetas.Visa;

public class Main {
    public static void main(String[] args) {
        CarteraImpl b1= new CarteraImpl("Enero");
        b1.agregarTarjeta(new Joven("000-1112-111",10000));
        b1.agregarTarjeta(new Nomina("000-1112-222",100000));
        b1.agregarTarjeta(new Visa("000-1112-333",80000));
        b1.agregarTarjeta(new Joven("000-1112-444",12000));
        b1.imprimirListaDeTarjetas();

        CarteraImpl b2= new CarteraImpl("Febrero");
        b2.agregarTarjeta(new Joven("000-2345-111",25000));
        b2.agregarTarjeta(new Nomina("000-2345-222",90000));
        b2.agregarTarjeta(new Visa("000-2345-333",75000));
        b2.agregarTarjeta(new Joven("000-2345-444",18000));
        b2.imprimirListaDeTarjetas();
    }
}