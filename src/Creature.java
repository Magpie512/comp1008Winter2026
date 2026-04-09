class Creature {
    public String name;
    public int health;

    /* Constructor sets both fields */
    public Creature(String name, int health) {
        this.name = name;
        this.health = health;
    }

    /* Attack method */
    void attack(){
        System.out.println(name + " attacks!");
    }

    void takeDamage(int damage){
        health = health - damage;
        System.out.println("Health: " + health);
    }

    public String toString(){
        return "Name: " + name + " Health: " + health;
    }
}