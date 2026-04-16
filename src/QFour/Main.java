package QFour;

public class Main {
    static void main(String[] args) {
        Greeter g;
        g = new Greeter();
        g.greet();
        g = new CasualGreeter();
        g.greet();
        g = new FormalGreeter();
        g.greet();
    }
}
