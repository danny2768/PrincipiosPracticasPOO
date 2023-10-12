package deportistas;

import enums.EValorCuota;

public class Nino extends Deportista {

    public Nino(String identificacion) {
        super(identificacion);
    }

    @Override
    public double cuotaAPagar() {
        return EValorCuota.TIPOA.getValorCuota();
    }
}
