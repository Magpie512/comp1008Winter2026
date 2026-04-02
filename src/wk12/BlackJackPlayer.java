class BlackJackPlayer extends Participant implements Rules{
    public Player(String name){
        super(name);
    }
    
    

    public boolean canPlay(){
        return getHandTotal() < BLACKJACK;
    }
}
