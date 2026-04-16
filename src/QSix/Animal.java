package QSix;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
    /* abstract method string makeSound*/

    public abstract String makeSound();

    public void speak() {
        System.out.println(name + ": " + makeSound());
    }
}
