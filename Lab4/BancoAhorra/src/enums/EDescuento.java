package enums;

public enum EDescuento {
    BASICO(0.08),
    PLATINO(0.12),
    DIAMANTE(0.15);
    private double discount;
    EDescuento(double discount) {
        this.discount = discount;
    }

    public double getValorDescontado(double monto) {
        return monto * discount;
    }
}
