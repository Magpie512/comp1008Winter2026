public class Spirit extends Creature{
    int mana;

    public Spirit(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    @Override
    void attack(){
        if (mana>10){
            System.out.println("Spirit " + name + " attacks with mana:" + mana );
            mana=-10;
        }
        else{
            System.out.println("Spirit " + name + " is too weak to attack.");
        }
    }


}
