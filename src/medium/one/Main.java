package medium.one;

public class Main {
    static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.sound(); //Meow
        dog.sound(); //No
    }
}
