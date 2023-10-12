package tarjetas;

import enums.EDescuento;

public class Visa extends Tarjeta{
    int cuotaManejo;

    public Visa(String numeroDeCuenta, double valorApertura){
        super(numeroDeCuenta, valorApertura);
        cuotaManejo = 20000;
    }

    @Override
    public double cuotaDeManejo(){
        return (cuotaManejo - EDescuento.DIAMANTE.getValorDescontado(cuotaManejo));
    }
}
