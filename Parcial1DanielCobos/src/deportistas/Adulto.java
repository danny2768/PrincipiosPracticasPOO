package deportistas;

import enums.EValorCuota;

public class Adulto extends Deportista{
    private boolean hijosInscritos;

    public Adulto(String identificacion, boolean hijosInscritos) {
        super(identificacion);
        this.hijosInscritos = hijosInscritos;
    }

    @Override
    public double cuotaAPagar() {
        if (hijosInscritos) {
            return EValorCuota.TIPOD.getValorCuota();
        } else {
            return EValorCuota.TIPOE.getValorCuota();
        }
    }
}
