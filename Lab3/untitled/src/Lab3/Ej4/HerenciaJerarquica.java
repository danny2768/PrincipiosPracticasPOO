package Lab3.Ej4;

public class HerenciaJerarquica {
    public static void main(String args[])
    {
        H2 h2 = new H2();
        h2.dispH2();
        h2.dispH1();

        H3 h3 = new H3();
        h3.dispH3();
        h3.dispH1();

        H4 h4 = new H4();
        h4.dispH4();
        h4.dispH1();
    }
}
