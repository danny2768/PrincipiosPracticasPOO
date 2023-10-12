package deportistas;

import enums.EValorCuota;

public class Adolescente extends Deportista{
    private int age;
    public Adolescente(String identificacion, int age) {
        super(identificacion);
        this.age = age;
    }

    @Override
    public double cuotaAPagar() {
        if (age < 15) {
            return EValorCuota.TIPOB.getValorCuota();
        } else {
            return EValorCuota.TIPOC.getValorCuota();
        }
    }

    public int getAge() {
        return age;
    }
}
