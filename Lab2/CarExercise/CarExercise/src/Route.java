public class Route {
    public int id;
    public String[] stops;
    public int numStops;
    public Map map;

    public Route( int id ) {
        this.id = id;
        stops = new String[100];
        numStops = 0;
    }

    public void addStop( String city, String stop ) {
        map = new Map( city );
        stops[numStops] = stop;
        numStops ++;
    }

    public void printRoute() {
        System.out.println("**** City: " + map.getCity() +" ****");
        System.out.println("**** Route to follow ****");
        for(int i = 0; i < numStops; i++){
            System.out.println("* --> " + stops[i]);
        }
    }
}
