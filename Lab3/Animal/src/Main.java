public class Main {
    public static void main(String[] args) {
        System.out.println("Lobo");
        Lobo elLobo = new Lobo();
        elLobo.hacerRuido();
        elLobo.comer();
        elLobo.desplazarse();

        System.out.println();

        System.out.println("Leon");
        Leon elLeon = new Leon();
        elLeon.hacerRuido();
        elLeon.comer();
        elLeon.desplazarse();
    }
}