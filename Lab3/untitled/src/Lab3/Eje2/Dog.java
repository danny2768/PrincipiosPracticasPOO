package Lab3.Eje2;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof! Woof!");
    }
}
