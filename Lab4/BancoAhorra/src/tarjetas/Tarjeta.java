package tarjetas;

public abstract class Tarjeta {
    public String numeroDeCuenta;
    private double valorApertura;

    public Tarjeta(String numeroDeCuenta, double valorApertura){
        this.numeroDeCuenta = numeroDeCuenta;
        this.valorApertura = valorApertura;
    }

    public abstract double cuotaDeManejo();

    public String toString(){
        return "El valor de cuota de: " + numeroDeCuenta + " es: " + cuotaDeManejo() + " tipo de tarjeta " + this.getClass().getSimpleName();
    }

    public double getValorApertura() {
        return valorApertura;
    }
}
