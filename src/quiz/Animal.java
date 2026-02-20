package quiz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class Animal {

    private int age; //(1-25)
    private String name; // REgex ^[A-Z][a-z]+$
    private int[] vaccinationYears;

    public Animal(int age, String name, int[] vaccinationYears) {
        if (age < 1 || age > 25) {
            throw new IllegalArgumentException("Age must be between 1 and 25.");
        }
        if (!name.matches("^[A-Z][a-z]+$")) {
            throw new IllegalArgumentException("Name must start with an uppercase letter followed by lowercase letters.");
        }
        this.age = age;
        this.name = name;
        this.vaccinationYears = vaccinationYears;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int[] getVaccinationYears() {
        return vaccinationYears;
    }

    // Static factory methods
    public static Animal createPuppy(String name, int[] vaccinationYears) {
        return new Animal(1, name, vaccinationYears);
    }

    public static Animal createSeniorDog(String name, int[] vaccinationYears) {
        return new Animal(10, name, vaccinationYears);
    }

    @Override
    public String toString() {
        StringBuilder strbuild = new StringBuilder();
        strbuild.append("Name: ").append(name).append("\n");
        strbuild.append("Age: ").append(age).append("\n");
        strbuild.append("Vaccination Years: ");
        for (int year : vaccinationYears) {
            strbuild.append(year).append(" ");
        }
        return strbuild.toString();
    }

    // Standard Test for age
    @Test
    public void testAgeValidation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Animal(0, "Buddy", new int[]{2020});
        });
        assertEquals("Age must be between 1 and 25.", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Buddy", "Max"})
    public void testValidName(String name) {
        Animal animal = new Animal(5, name, new int[]{2020});
        assertEquals(name, animal.getName());
    }

    // Tests for name
    @Test
    public void testNameValidation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Animal(5, "buddy", new int[]{2020});
        });
        assertEquals("Name must start with an uppercase letter followed by lowercase letters.", exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource({"1,Buddy,2020", "10,Max,2019"})
    public void testAnimalCreation(int age, String name, int vaccinationYear) {
        Animal animal = new Animal(age, name, new int[]{vaccinationYear});
        assertEquals(age, animal.getAge());
        assertEquals(name, animal.getName());
        assertArrayEquals(new int[]{vaccinationYear}, animal.getVaccinationYears());
    }
}

}
