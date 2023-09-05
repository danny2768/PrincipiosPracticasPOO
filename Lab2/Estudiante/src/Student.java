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

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Nivel: " + level);
        System.out.println("Direccion: " + address);
        System.out.println("Descripcion: " + address.description);
        System.out.println("Barrio: " + address.town + " Ciudad: " + address.city);

    }
}
