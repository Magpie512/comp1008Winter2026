package fighting_game;

public class Player extends Fighter {

    // Number of times the player can block an incoming attack.
    private int blockAttackCount = 1;

    // When true, the next incoming attack will be completely blocked.
    private boolean isBlockingAttack;

    /**
     * Overrides Fighter.setHealth().
     * If the player is currently blocking, the incoming damage is ignored.
     * The block is consumed immediately after it triggers.
     */
    @Override
    public void setHealth(int health) {
        if (isBlockingAttack) {
            isBlockingAttack = false; // Reset the block
            return;                   // Ignore the incoming damage entirely
        }

        // If not blocking, take damage normally.
        super.setHealth(health);
    }

    /**
     * Activates the player's block ability.
     * Can only be used if the player still has block charges left.
     * The next attack that would reduce health is negated.
     */
    public void useBlockAttack() {
        if (blockAttackCount <= 0) {
            return; // No blocks remaining
        }

        blockAttackCount--;   // Consume one block charge
        isBlockingAttack = true; // Next attack will be blocked
    }

    /**
     * Standard Player constructor.
     * Players do not modify their stats based on opponents like Boss does.
     */
    public Player(String name, int power, int health) {
        super(name, power, health);
    }
}