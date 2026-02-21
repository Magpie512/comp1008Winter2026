package q1;

import java.util.Arrays;

public class airplaneTicket {

    private final double fare;
    private final String ticketCode; // 2 uppercase letters + 4 numbers
    private final int[] seatNumber;

    public airplaneTicket(double fare, String ticketCode) {
        this(fare, ticketCode, new int[0]);
    }

    public airplaneTicket(double fare, String ticketCode, int[] seatNumber) { validateFare(fare);
        validateTicketCode(ticketCode);
        if (seatNumber == null) {
            throw new IllegalArgumentException("Seat numbers cannot be null.");
        }

        this.fare = fare;
        this.ticketCode = ticketCode;
        this.seatNumber = Arrays.copyOf(seatNumber, seatNumber.length);
    }

    public static airplaneTicket economyTicket(double fare, String ticketCode, int[] seatNumber) {
        return new airplaneTicket(fare, ticketCode, seatNumber);
    }

    public static airplaneTicket businessTicket(double fare, String ticketCode, int[] seatNumber) {
        return new airplaneTicket(fare, ticketCode, seatNumber);
    }

    public double getFare() {
        return fare;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public int[] getSeatNumber() {
        return Arrays.copyOf(seatNumber, seatNumber.length);
    }

    private static void validateFare(double fare) {
        if (fare <= 0) {
            throw new IllegalArgumentException("Fare must be positive.");
        }
    }

    private static void validateTicketCode(String ticketCode) {
        if (ticketCode == null || !ticketCode.matches("^[A-Z]{2}\\d{4}$")) {
            throw new IllegalArgumentException("Ticket code must match format ^[A-Z]{2}\\d{4}$.");
        }
    }

    @Override
    public String toString() {
        StringBuilder ticketBuilder = new StringBuilder();
        ticketBuilder.append("Fare: ").append(fare).append("\n");
        ticketBuilder.append("Ticket Code: ").append(ticketCode).append("\n");
        ticketBuilder.append("Seat Numbers: ");
        for (int seat : seatNumber) {
            ticketBuilder.append(seat).append(" ");
        }
        return ticketBuilder.toString().trim();
    }
}
