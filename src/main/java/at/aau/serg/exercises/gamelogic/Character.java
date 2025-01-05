package at.aau.serg.exercises.gamelogic;

public abstract class Character {

    private CharacterClass characterClass;
    private DamageEffect damageEffect;
    private DamageType damageType;

    private String name;

    private Integer level;

    /**
     * Allowed classes: Mage, Tank, DamageDealer
     */

    private double damage;

    public Character(String name, int level, double damage) {
        this.name = name;
        this.level = level;
        this.damage = damage;
    }

    /**
     * Used for range and magic damage types, melee ignores this value
     */

    /**
     * 1 := melee (tank always has this)
     * 2 := range
     * 3 := magic (only mage has this, always)
     */

    /**
     * None (null), fire, poison, pierce
     */

    /**
     * Indicates if a tank currently has their shield equipped
     */

    /**
     * Available mana of mage
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public boolean hasMaxLevel() {
        return this.level == 30;
    }

    public abstract String getDescription();
}

    class DamageDealer extends Character {
        private DamageType damageType;

        public DamageDealer(String name, int level, double damage, DamageType damageType) {
            super(name, level, damage); // Call the superclass constructor correctly
            this.damageType = damageType;
        }

        public DamageType getDamageType() {
            return damageType;
        }

        public void setDamageType(DamageType damageType) {
            this.damageType = damageType;
        }

        @Override
        public String getDescription() {
            return "Damage Dealer: A swift attacker who deals heavy damage.";
        }
    }


    public boolean hasMaxLevel(){
        return level.equals(30);
    }

}
