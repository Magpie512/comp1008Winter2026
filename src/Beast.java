public class Beast extends Creature{
    int rage;

    public Beast(String name, int health,int rage) {
        super(name, health);
        this.rage = rage;
    }

    @Override
    void attack(){
        System.out.println("Beast " + name + " attacks with rage:" + rage );
        rage=+5;
    }
}
