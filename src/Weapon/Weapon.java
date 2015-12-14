/*
 * Generic weapon class.
 * Contains all attributes that ALL weapons will contain.
 */

public class Weapon {

    /* Notice how these are all private? This is intentional. */
    private String name;
    private float damage;
    private final int maxDurability;
    private int curDurability; 

    public Weapon(String name, float damage, int maxDurability) {
        this.name = name;
        this.damage = damage;
        this.maxDurability = maxDurability;
        this.curDurability = maxDurability;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public float getDamage() {
        return damage;
    }
    
    public void setDamage(float dmg) {
        this.damage = dmg;
    }
    
    public int getCurDurability() {
        return curDurability;
    }
    
    public int getMaxDurability() {
        return maxDurability;
    }
    
    @Override
    public String toString() {
        return( "Weapon name: " + name +
                "\nWeapon damage: " + damage +
                "\nMax durability: " + maxDurability +
                "\nCurrent durability: " + curDurability);
    }
    
    /* Main method used for testing */
    public static void main(String[] args) {
        
        // Create an instance of our weapon class.
        // 1st parameter: Name does not matter, but allows for more customization.
        // 2nd parameter: Damage the weapon will deal. Can be adjusted later.
        // 3rd parameter: Durability. # of times the weapon can be used before breaking.
        Weapon axe = new Weapon("Harbringer", 10, 25);
        
        // Use our toString() method to display weapon data.
        System.out.println(axe.toString());   
    }
    
    
}