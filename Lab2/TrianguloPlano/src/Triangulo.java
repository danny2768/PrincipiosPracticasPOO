public class Triangulo {

    public int base;
    public int altura;
    public Punto loc;
    public Triangulo(int base, int altura, Punto punto) {
        this.base = base;
        this.altura = altura;
        this.loc = punto;
    }

    public Triangulo(int base, int altura, int x, int y) {
        this.base = base;
        this.altura = altura;
        this.loc = new Punto(x, y);
    }

}
