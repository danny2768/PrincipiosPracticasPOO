public class Car {
    public Color color;
    public Route route;
    public String brand;
    public String model;
    public int year;

// * First constructor - Doesn't require color or Route.
    public Car( String brand, String model, int year ){
        this.brand = brand;
        this.model = model;
        this.year = year;
        color = new Color(0,0,0);
    }

// * Set Color
    public void setColor(int red, int green, int blue) {
        color = new Color(red, green, blue);
    }

// * Set Route
    public void setRoute( int routeId, String city, String stop) {
        route = new Route(routeId);
        route.addStop( city, stop );
    }

// * Second constructor - Requires color and Route.
    public Car( String brand, String model, int year, int red, int green, int blue, int routeId){
        this.brand = brand;
        this.model = model;
        this.year = year;
        color = new Color(red, green, blue);
        route = new Route(routeId);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
