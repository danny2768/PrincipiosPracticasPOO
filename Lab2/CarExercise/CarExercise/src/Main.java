public class Main {
    public static void main(String[] args) {
        Car spark = new Car("Chevrolet","Spark", 2013);
            Car march = new Car("Nissan","March", 2020, 255, 0, 0, 1);

        spark.setColor(100, 150, 200);

        spark.setRoute(1, "Bucaramanga", "La quinta");
        spark.route.addStop("SantaMarta", "Rodadero");

        spark.route.printRoute();

        // ! Fix city issue.
        // TODO: Add getters and setters for all the classes
        // TODO:

    }
}