package QOne;

public class MessageSender {

    void send(String text) {
        System.out.println("Sending message: " + text);
    }
    void send(String text, int priority) {
        System.out.println("Sending message: " + text + " with priority: " + priority);
    }
}


