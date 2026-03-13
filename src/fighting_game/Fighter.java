package fighting_game;

public class Fighter {

    // The fighter's name (e.g., "Ryu", "Scorpion")
    private String name;

    // The amount of damage this fighter deals when attacking
    private int power;

    // The fighter's current health points
    private int health;

    // Constructor: creates a new Fighter with a name, power, and starting health
    public Fighter(String name, int power, int health) {
        this.name = name;
        this.power = power;
        this.health = health;
    }

    // Makes this fighter attack another fighter
    // It reduces the attacked fighter's health by this fighter's power
    public void attack(Fighter attackedFighter) {
        attackedFighter.setHealth(attackedFighter.getHealth() - getPower());
    }

    // Returns true if the fighter still has health above 0
    public boolean isAlive() {
        return health > 0;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for power
    public int getPower() {
        return power;
    }

    // Setter for power
    public void setPower(int power) {
        this.power = power;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Setter for health
    public void setHealth(int health) {
        this.health = health;
    }
}