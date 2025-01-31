package project3;

/**
 * Group Members:
 * - Martin Mendoza - gqb4
 * - Humera Durvesh - h_d111
 * - Kody Norsworthy, ksn27
 * - Maricar Lagtapon - ipp11
 * 
 * Shield defense class that implements Abilities
 * 
*/

public class ShieldDefense implements Abilities{

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
    * prints out the graphical effect of the shield defense.
    */
    @Override
    public String graphicalEffect() {
        return "The shield rebounds the attack.";	
    }

    /**
     * prints out graphical effect in which shield defense fails
     */
    public String failureGraphic() {
        return "Shield is dropped as the fighter falls asleep.";
    }
}
