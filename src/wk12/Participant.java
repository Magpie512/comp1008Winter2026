abstract class Participant{
    private String name;
    private Card[] hand;
    private int handTotal;
    private int handIndex;
    private final int MAX_NUM_CARDS = 10;
    public final int BLACKJACK = 21;
    
    public String getName(){
        return name;
    }
    public int getHandTotal(){
        return handTotal;
    }
    public void setName(String name){
        this.name = name;
    }
    private void setHandTotal(int total){
        handTotal = total;
    }
    public void getHand(){
        System.out.println(name + " cards are: ");
        for(Card current : hand){
            System.out.println(current);
        }
    }
    public void addCardToHand(Card card){
        hand[handIndex] = card;
        generateHandTotal();
    }
    private void generateHandTotal(){
        int total = 0;
        for(int i = 0; i < handIndex; i++){
            total += hand[handIndex].getValue();
        }
        setHandTotal(total);
    }
    
        public void hit(Card card){
        addCardToHand(card);
    }

    
    public Participant(String name){
        setName(name);
        hand = new Card[MAX_NUM_CARDS];
    }
}
