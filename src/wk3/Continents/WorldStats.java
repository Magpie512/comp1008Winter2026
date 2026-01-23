package wk3.Continents;

public class WorldStats {
    // 1. ATTRIBUTES
    // This array stores the names of the continents
    String[] continents;
    // This array stores the population for the continent at the matching index
    int[] populationPerContinent;
    // This keeps track of how many continents have actually been added so far
    int indexTracker;

    // 2. ACTIONS / METHODS

    // 1-arg constructor: Initializes the arrays with a specific size
    public WorldStats(int numContinents) {
        // We use the input 'numContinents' to set the capacity of our arrays
        this.continents = new String[numContinents];
        this.populationPerContinent = new int[numContinents];

        // We start at 0 because no data has been added yet
        this.indexTracker = 0;
    }

    // Adds a new continent and population to the next available slot
    public void addContinent(String name, int population) {
        // Use the indexTracker to place the data in the current empty spot
        continents[indexTracker] = name;
        populationPerContinent[indexTracker] = population;

        // Increment the tracker so the NEXT continent goes into the NEXT slot
        indexTracker++;
    }

    // Searches for a continent by name and returns its population
    public int getContinentByName(String name) {
        // We loop from 0 up to indexTracker (the number of continents we've added)
        for (int i = 0; i < indexTracker; i++) {

            // Check if the name in the array matches the name we are looking for
            // We use .equals() for String comparison
            if (continents[i].equals(name)) {

                // If found, return the population at the SAME index 'i'
                return populationPerContinent[i];
            }
        }

        // If the loop finishes without finding anything, return -1 to signal "not found"
        return -1;
    }
}