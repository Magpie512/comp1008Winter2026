package Hard.One;

public class Manager extends Employee{
    public Manager(String name,int id,double salary){
        super(name, id, salary);
    }
    @Override
    public double calculateBonus(){
        return salary * 0.10;
    }
}
