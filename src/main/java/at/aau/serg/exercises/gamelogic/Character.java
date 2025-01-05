package at.aau.serg.exercises.gamelogic;

public class Character {

    private CharacterClass characterClass;
    private DamageEffect damageEffect;


    private String name;

    private Integer level;

    /**
     * Allowed classes: Mage, Tank, DamageDealer
     */

    private double damage;

    /**
     * Used for range and magic damage types, melee ignores this value
     */
    private int damageRange;

    /**
     * 1 := melee (tank always has this)
     * 2 := range
     * 3 := magic (only mage has this, always)
     */
    private short damageType;

    /**
     * None (null), fire, poison, pierce
     */

    /**
     * Indicates if a tank currently has their shield equipped
     */
    private boolean hasShieldEquipped;

    /**
     * Available mana of mage
     */
    private int mana;

    public String getDescription() {
        switch (characterClass) {
            case "Mage":
                return "Mage: A spellcaster who wields powerful magic.";
            case "Tank":
                return "Tank: A sturdy protector who absorbs damage and defends allies.";
            case "DamageDealer":
                return "Damage Dealer: A swift attacker who deals heavy damage.";
            default:
                throw new IllegalStateException("Unexpected character class: " + characterClass);
        }
    }

    public boolean hasMaxLevel(){
        return level.equals(30);
    }

}
