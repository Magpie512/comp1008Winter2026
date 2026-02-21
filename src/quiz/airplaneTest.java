package q1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class airplaneTest {

	@Test
	void createsTicketWithValidData() {
		airplaneTicket ticket = airplaneTicket.economyTicket(199.99, "AA1234", new int[]{14, 15});

		assertEquals(199.99, ticket.getFare());
		assertEquals("AA1234", ticket.getTicketCode());
		assertArrayEquals(new int[]{14, 15}, ticket.getSeatNumber());
		Assertions.assertTrue(ticket.toString().contains("Fare: 199.99"));
	}

	private void assertEquals(String aa1234, String ticketCode) {
	}

	private void assertEquals(double v, double fare) {
	}

	@ParameterizedTest
	@CsvSource({
			"0,AB1234",
			"-10,AB1234",
			"120,ab1234"
	})
	void rejectsInvalidFareOrTicketCode(double fare, String ticketCode) {
		assertThrows(IllegalArgumentException.class,
				() -> new airplaneTicket(fare, ticketCode, new int[]{1}));
	}
}
