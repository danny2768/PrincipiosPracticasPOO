public class Main {
    public static void main(String[] args) {
        float salary = 1000000;
        float deTotal = 0;
        float des;

        for(EImpuesto impuesto: EImpuesto.values()){
            des = impuesto.getDescuento(salary);
        }
    }
}