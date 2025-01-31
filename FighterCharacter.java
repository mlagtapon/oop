package project3;

/**
 * Group Members:
 * - Kody Norsworthy, ksn27
 * - Martin Mendoza - gqb4
 * - Humera Durvesh - h_d111
 * - Maricar Lagtapon - ipp11
 * 
 * Represents a fighter character with heavy armor and special abilities.
 * This class extends the BaseCharacter and implements the Abilities interface.
 */
public class FighterCharacter extends BaseCharacter implements Abilities {

    private static final int DEFAULT_HIT_POINTS = 150;
    private static final String ARMOR_TYPE = "Heavy";
    private String failureGraphic;
    private String graphicEffect;

    /**
     * Constructor for FighterCharacter that initializes hit points, armor type,
     * and graphical effects.
     */
    public FighterCharacter() {
        this.hitPoints = DEFAULT_HIT_POINTS;
        this.armorType = ARMOR_TYPE;
        this.graphicEffect = "The shield rebounds the attack.";
        this.failureGraphic = "Shield is dropped as the fighter falls asleep.";
    }

    /**
     * Calculates the damage done by the fighter.
     * @param hit the hit value to calculate the damage
     * @return the damage value
     */
    @Override
    public int calculateDamage(int hit) {
        return hit;
    }

    /**
     * Triggers the graphical effect related to the fighter's action.
     * @return 
     */
    @Override
    public String graphicalEffect() {
        return graphicEffect;
    }

    /**
     * Retrieves the class type of this character.
     * @return the class type as a string
     */
    @Override
	public String getClassType() {
        return "Fighter";
    }
    
    public String getGraphicEffect() {
        return graphicEffect;
    }

    /*public String getFailureGraphic() {
       return failureGraphic;
    }*/

    public void setGraphicEffect(String graphicEffect) {
        this.graphicEffect = graphicEffect;
    }

    public void setFailureGraphic(String failureGraphic) {
        this.failureGraphic = failureGraphic;
    }

    @Override
    public String failureGraphic() {
        return failureGraphic;
    }

}

