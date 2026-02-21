package quiz;
// requires double fare (positive only)
// String ticket code validated with regex ^[A-Z]{2}\d{4}&
// int[] seatNumbers

// also required is at least 2 constructors
// static factories (economyTicket(), businessTicket()
//validation and exception handling
//toString that constructs using the StringBuilder
// Unit tests: 1 regular test, 1 parameterized test for fare and ticket code, totalling 4 tests
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions;

public class Main {
    double fare;
    String ticketCode;
    int[] seatNumbers;

    public Main(double fare, String ticketCode, int[] seatNumbers) {
        if (fare <= 0) {
            throw new IllegalArgumentException("Fare must be positive.");
        }
        if (!ticketCode.matches("^[A-Z]{2}\\d{4}$")) {
            throw new IllegalArgumentException("Invalid ticket code format.");
        }
        this.fare = fare;
        this.ticketCode = ticketCode;
        this.seatNumbers = seatNumbers;
    }

    public static Main economyTicket(double fare, String ticketCode, int[] seatNumbers) {
        return new Main(fare, ticketCode, seatNumbers);
    }

    public static Main businessTicket(double fare, String ticketCode, int[] seatNumbers) {
        return new Main(fare, ticketCode, seatNumbers);
    }

    @Override 
    public String toString(){
        StringBuilder strbuild = new StringBuilder();
        strbuild.append("Fare: ").append(fare).append("\n");
        strbuild.append("Ticket Code: ").append(ticketCode).append("\n");
        strbuild.append("Seat Numbers: ");
        for (int seat : seatNumbers) {
            strbuild.append(seat).append(" ");
        }
        return strbuild.toString();
    }

    // Regular Test for fare
    @Test
    public void testFareValidation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Main(-10, "AB1234", new int[]{1, 2});
        });
        assertEquals("Fare must be positive.", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"AB1234", "XY5678"})
    public void testValidTicketCode(String ticketCode) {
        Main ticket = new Main(100, ticketCode, new int[]{1, 2});
        assertEquals(ticketCode, ticket.ticketCode);
    }
}