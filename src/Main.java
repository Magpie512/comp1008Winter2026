public class Main {
    public static void main(String[] args) {

        Beast beast = new Beast("Beast", 100, 10);
        Spirit spirit = new Spirit("Spirit", 100, 50);

        // Polymorphism demo
        Creature[] party = { beast, spirit };

        // Attack twice each
        for (Creature c : party) {
            c.attack();
            c.attack();
        }

        // Take damage at least once
        beast.takeDamage(15);
        spirit.takeDamage(20);

        // Print objects to test toString()
        System.out.println(beast);
        System.out.println(spirit);
    }
}