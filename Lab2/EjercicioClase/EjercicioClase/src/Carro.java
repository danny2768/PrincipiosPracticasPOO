public class Carro {
    public Color color;
    public String modelo;
    public int anho;

    public Carro(String modeloIni, int anhoIni){
        modelo = modeloIni;
        anho = anhoIni;
        color = new Color(0,0,0);
    }

    public Carro(String modeloIni, int anhoIni, int rojoIni, int azulIni, int verdeIni) {
        modelo = modeloIni;
        anho = anhoIni;
        color = new Color(rojoIni, verdeIni, azulIni);

    }
}
