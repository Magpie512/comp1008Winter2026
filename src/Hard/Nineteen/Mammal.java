package Hard.Nineteen;

public class Mammal extends Animal{
    public Mammal(){
        super();
        System.out.println("Mammal Constructor Called");
    }

    @Override
    public void speak(){
        System.out.println("Mammalian vocalization.");
    }
}
