package AnimalSounds;

public class Main {
    static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
        Dog dog = new Dog();
        dog.speak();
        Cat cat = new Cat();
        cat.speak();
    }
}
