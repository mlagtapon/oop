package project3;

/**
 * Group Members: 
 * - Maricar Lagtapon - ipp11
 * - Martin Mendoza - gqb4
 * - Humera Durvesh - h_d111
 * - Kody Norsworthy, ksn27
 * 
 * A class that represents the new
 * ability called LuteMusic
 *
*/

public class LuteMusic implements Abilities {

    int hitPoints;
    @Override
    public int calculateDamage(int hit) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String graphicalEffect() {
        return "The lullaby makes the combatant sleepy.";
    }

    @Override
    public String failureGraphic() {
        return "Lute is engulfed in flames.";
    }
}
