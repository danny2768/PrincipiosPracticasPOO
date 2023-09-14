public class Student {
    public String name;
    public int level;
    public Address address;

    public Student(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Student(String name, int level, Address address) {
        this.name = name;
        this.level = level;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Nivel: " + level);
        System.out.println("Direccion: " + address.getCity() + " " + address.getTown() + " " + address.getDescription());
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // * Getters
    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    // * Setters
    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }
}
