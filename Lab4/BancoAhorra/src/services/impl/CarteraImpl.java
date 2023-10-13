package services.impl;

import services.interfaces.IPatronCartera;
import tarjetas.Tarjeta;

import java.util.ArrayList;
import java.util.List;

public class CarteraImpl implements IPatronCartera {
    private String nombreMes;
    private List<Tarjeta> listaTarjetas;

    public CarteraImpl(String nombreMes) {
        this.nombreMes = nombreMes;
        listaTarjetas = new ArrayList<>();
    }

    @Override
    public void agregarTarjeta(Tarjeta tarjeta) {
        listaTarjetas.add(tarjeta);
    }

    @Override
    public void imprimirListaDeTarjetas() {
        System.out.println("***** Balance de " + getNombreMes() + " ******");
        for (Tarjeta tarjeta : listaTarjetas) {
            System.out.println(tarjeta);
        }
    }

    private String getNombreMes() {
        return nombreMes;
    }
}
