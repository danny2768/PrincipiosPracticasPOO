package Lab3.Eje2;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow! Meow!");
    }
}
