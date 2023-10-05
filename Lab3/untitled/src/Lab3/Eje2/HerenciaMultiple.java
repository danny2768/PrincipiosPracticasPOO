package Lab3.Eje2;

public class HerenciaMultiple {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1);
        Dog dog = new Dog("Dog", 2);
        Cat cat = new Cat("Cat", 3);

        animal.speak();
        dog.speak();
        cat.speak();
    }
}
