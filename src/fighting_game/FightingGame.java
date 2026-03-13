package fighting_game;

public class FightingGame {

    public static void main(String[] args) {

        // Create two Fighter objects.
        // Each fighter has: name, attack power, and health.
        Fighter f1 = new Fighter("Ryu", 10, 20);
        Fighter f2 = new Fighter("Ken", 20, 40);

        // f1 (Ryu) performs an attack on f2.
        // This will reduce f2's health based on f1's attack power.
        f1.attack(f2);

        // Print f2's remaining health after being attacked.
        System.out.println(f2.getHealth());
    }
}