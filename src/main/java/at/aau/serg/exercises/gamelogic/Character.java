package at.aau.serg.exercises.gamelogic;

public abstract class Character {

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

// Mage class
class Mage extends Character {
    private int mana;

    public Mage(String name, int level, double damage, int mana) {
        super(name, level, damage);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String getDescription() {
        return "Mage: A spellcaster who wields powerful magic.";
    }
}

// Tank class
class Tank extends Character {
    private boolean hasShieldEquipped;

    public Tank(String name, int level, double damage, boolean hasShieldEquipped) {
        super(name, level, damage);
        this.hasShieldEquipped = hasShieldEquipped;
    }

    public boolean hasShieldEquipped() {
        return hasShieldEquipped;
    }

    public void setShieldEquipped(boolean hasShieldEquipped) {
        this.hasShieldEquipped = hasShieldEquipped;
    }

    @Override
    public String getDescription() {
        return "Tank: A sturdy protector who absorbs damage and defends allies.";
    }
}

// DamageDealer class
class DamageDealer extends Character {
    private DamageType damageType;

    public DamageDealer(String name, int level, double damage, DamageType damageType) {
        super(name, level, damage);
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

// DamageType Enum
enum DamageType {
    MELEE, RANGE, MAGIC
}

// DamageEffect Enum
enum DamageEffect {
    NONE, FIRE, POISON, PIERCE
}
