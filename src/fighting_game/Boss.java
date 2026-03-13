package fighting_game;

public class Boss extends Fighter {

    // Tracks whether the next attack should use the special move multiplier.
    private boolean specialMoveActivated;

    // Bosses can only use their special move once.
    private int specialMoveCount = 1;

    /**
     * Overrides Fighter.getPower().
     * If a special move was activated beforehand, the next attack
     * deals triple damage. After that, the special flag resets.
     */
    @Override
    public int getPower() {

        int multiplier = 1;

        // If the special move was triggered, apply the bonus once.
        if (specialMoveActivated) {
            specialMoveActivated = false; // Consume the special move
            multiplier = 3;               // Triple the attack power
        }

        // Multiply the base Fighter power by the special multiplier.
        return multiplier * super.getPower();
    }

    /**
     * Allows the boss to activate its special move.
     * Can only be used if the boss still has special move charges left.
     */
    public void useSpecialMove() {
        if (specialMoveCount <= 0) {
            return; // No special moves remaining
        }

        specialMoveActivated = true; // Next attack will be boosted
        specialMoveCount--;          // Reduce remaining uses
    }

    /**
     * Boss constructor.
     * Bosses have double the health of their opponent.
     * Also prevents a boss from fighting another boss.
     */
    public Boss(String name, int power, Fighter opponent) {

        // Boss health = opponent's health * 2
        super(name, power, opponent.getHealth() * 2);

        // Prevent boss-vs-boss matchups
        if (opponent instanceof Boss) {
            throw new IllegalArgumentException("A boss cannot fight itself");
        }
    }
}