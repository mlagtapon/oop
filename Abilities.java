package project3;

/**
 * Group Members:
 * - Kody Norsworthy, ksn27
 * - Maricar Lagtapon - ipp11
 * - Humera Durvesh - h_d111
 * - Martin Mendoza - gqb4
 * 
 * Abilities Interface - Represents the common abilities 
 * structure for all characters
 * 
*/

public interface Abilities {
    
    /**
    *A constant that represents the percentage for abilities calculation.
    */
    final int PERCENT = 100;

    /**
    * Calculates the damage based on the hit provided.
    * 
    * @param hit The hit points.
    * @return The calculated damage.
    */
    int calculateDamage(int hit);

    /**
     * Prints the graphical representation of the ability.
     * @return 
     */
    String graphicalEffect();
    String failureGraphic();
}