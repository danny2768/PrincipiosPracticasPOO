package enums;

public enum EValorCuota {
    TIPOA(10000),
    TIPOB(20000),
    TIPOC(30000),
    TIPOD(40000),
    TIPOE(50000);
    int value;

    EValorCuota(int value) {
        this.value = value;
    }

    public int getValorCuota(){
        return value;
    }
}
