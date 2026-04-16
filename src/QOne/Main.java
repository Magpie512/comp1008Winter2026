package QOne;

public class Main extends UrgentMessageSender {
    public static void main(String[] args) {
        MessageSender sender = new UrgentMessageSender();
        sender.send("System down");
        sender.send("System down", 10);
    }
}