package project3;

/**
 * Group Members: 
 * - Maricar Lagtapon - ipp11
 * - Martin Mendoza - gqb4
 * - Humera Durvesh - h_d111
 * - Kody Norsworthy, ksn27
 * 
 * A class for all magic characters
 * that extends from the base character
 *
*/

public class MagicCharacter extends BaseCharacter implements Abilities {
    private FireballScroll fireball;

    /**
    * Creates an object MagicCharacter
    * with hit points initialized to 70
    * and armorType initialized to light
    */
    public MagicCharacter(){
        hitPoints = 70;
        armorType = "light";
        fireball = new FireballScroll();
    }

    /**
    * Creates an object FireballScroll
    * @return The FireballScroll object called fireball
    */
    public FireballScroll getFireballScroll() {
       return fireball;
    }
    
    /**
    * @return The string of its class type called magic
    */
    @Override
    public String getClassType() {
        return "Magic";
    }

    @Override
    public int calculateDamage(int hit) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String graphicalEffect() {
        // TODO Auto-generated method stub
        return null;
    }

	@Override
    public String failureGraphic() {
        return "Fireball rebounds into the mage’s scroll";
    }
}