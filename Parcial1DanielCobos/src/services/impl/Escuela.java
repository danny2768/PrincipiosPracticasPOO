package services.impl;

import deportistas.Deportista;
import services.interfaces.PatronEscuela;

import java.util.ArrayList;

public class Escuela implements PatronEscuela {
    String name;
    ArrayList<Deportista> listaDeportistas;

    public Escuela(String name){
        this.name = name;
        listaDeportistas = new ArrayList<>();
    }

    @Override
    public void imprimirListaDeCuotas() {
        for (Deportista deportista: listaDeportistas){
            System.out.println(deportista);
        }
    }

    @Override
    public void agregarDeportista(Deportista d) {
        listaDeportistas.add(d);
    }
}
