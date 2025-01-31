package project3;

/**
 * 
 * Base class for all character types 
 * 
*/

public abstract class BaseCharacter{

    private Object characterModel;
    public int hitPoints;
    public String armorType;

    /**
    * Getter for character model
    * @return The character model
    */
    public Object getCharacterModel() {
        return characterModel;
    }

    /**
    * Setter for character model
    *@param characterModel Sets the character model
    */
    public void setCharacterModel(Object characterModel) {
        this.characterModel = characterModel;
    }

    /**
     * Gets the class type of the character
     * @return The class type
     */
    public abstract String getClassType();

}