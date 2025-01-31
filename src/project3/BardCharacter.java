package project3;

/**
 * Group Members:
 * - Martin Mendoza - gqb4
 * - Humera Durvesh - h_d111
 * - Kody Norsworthy, ksn27
 * - Maricar Lagtapon - ipp11
 * 
 * Class for BardCharacters that extends BaseCharacter and implements Abilities
 * 
*/
public class BardCharacter extends BaseCharacter implements Abilities{
    
	/**
     * Creates an object BardCharacter with
     * 70 hitpoints and medium armor
     */
    public BardCharacter(){
        hitPoints = 100;
        armorType = "medium";
    }

    /**
     * @return the class type of the character "Bard"
    */
    public String getClassType() {
        return "Bard";
    }

    /**
     * @param hit is the hit points.
     * @return the percent of a character's hitPoints to take.
     */
    @Override
    public int calculateDamage(int hit) {
        int hpTaken = PERCENT - hit;
        return hpTaken;
    }

    /**
     * prints out graphical effect of the BardCharacter's ability
     * @return 
     */
    @Override
    public String graphicalEffect() {
        return "The lullaby makes the combatant sleepy.";
    }

    /**
    * graphic effect printed when BardCharacter loses battle
    * @return 
    */
    public String failureGraphic() {
        return "Lute is engulfed in flames.";
    }
}
