package easy.five;

public class Main {
    public static void main(String[] args) {
        Bird genericBird = new Bird();
        Parrot parrot = new Parrot();

        genericBird.fly();  // calls Bird.fly()
        parrot.fly();       // calls Parrot.fly()
    }
}

