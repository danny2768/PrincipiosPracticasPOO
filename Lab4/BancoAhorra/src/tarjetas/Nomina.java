package tarjetas;

import enums.EDescuento;

public class Nomina extends Tarjeta{
    int cuotaManejo;

    public Nomina(String numeroDeCuenta, double valorApertura){
        super(numeroDeCuenta, valorApertura);
        cuotaManejo = 20000;
    }

    public double cuotaDeManejo(){
        return (cuotaManejo - EDescuento.PLATINO.getValorDescontado(cuotaManejo));
    }

    @Override
    public double getValorApertura() {
        return super.getValorApertura();
    }
}
