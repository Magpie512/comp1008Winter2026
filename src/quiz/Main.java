package q1;

public class Main {

    static void main(String[] args) {
        airplaneTicket economy = airplaneTicket.economyTicket(150.0, "AB1234", new int[]{12, 13});
        airplaneTicket business = airplaneTicket.businessTicket(450.0, "CD5678", new int[]{1, 2});

        System.out.println(economy);
        System.out.println(business);
    }
}
