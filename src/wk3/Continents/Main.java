package wk3.Continents;

public class Main {
    static void main(String[] args) {
        // This line uses the Class, clearing the first warning
        WorldStats myWorld = new WorldStats(7);

        // This line uses the addContinent method, clearing the second warning
        myWorld.addContinent("Middle-earth", 1500000);
        myWorld.addContinent("Westeros", 40000000);

        // This line uses the getContinentByName method, clearing the third warning
        int pop = myWorld.getContinentByName("Middle-earth");
        System.out.println("The population is: " + pop);
    }
}