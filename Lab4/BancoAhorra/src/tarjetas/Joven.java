package tarjetas;
import enums.EDescuento;
public class Joven extends Tarjeta{
    int cuotaManejo;

    public Joven(String numeroDeCuenta, double valorApertura) {
        super(numeroDeCuenta, valorApertura);
        cuotaManejo = 20000;
    }

    @Override
    public double cuotaDeManejo(){
        return (cuotaManejo - EDescuento.BASICO.getValorDescontado(cuotaManejo));
    }
}
