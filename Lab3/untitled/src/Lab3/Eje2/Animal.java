package Lab3.Eje2;

public class Animal {
    protected String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(name + " says: I am an animal!");
    }
}
