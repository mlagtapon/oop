package project3;

/**
 * 
 * FireballScroll class that implements Abilities
 * 
*/

public class FireballScroll implements Abilities {
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
    * prints out the graphical effect of Fireball Scroll.
    */
    @Override
    public String graphicalEffect() {
       return "A large ball of flame hurtles toward the target.";
    }

    @Override
    public String failureGraphic() {
        return null;
    }
}