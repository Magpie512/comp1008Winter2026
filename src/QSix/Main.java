package QSix;

public class Main {
    static void main(String[] args) {
        Animal[] animals ={
                new Dog("Rex"),/*yk tyrannasaurus rex alwayas makes me laugh. Reptilian Tyrant King*/
                new Cat("Luna")
        };

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
