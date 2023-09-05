public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Juan Perez", 5);

        Address address1 = new Address("Calle 1 #1-1", "Chapinero", "Bogota");
        Student student2 = new Student("Juan Perez", 5, address1);

        Address address2 = new Address("Calle 1 #1-1", "Santa ana", "Medellin");
        Student student3 = new Student("Pablo Perez", 3, address2);

        student1.setAddress(address2);
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();

    }
}