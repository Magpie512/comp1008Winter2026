package Hard.Nineteen;

public class Dog extends Mammal{
    public Dog(){
        super();
        System.out.println("dog constructor");
    }
    @Override
    public void speak(){
        System.out.println("I'm not typing that");
    }
}
