import com.company.HavingSuperAbility;
public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String superAbilityType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbilityType() {
        return superAbilityType;
    }

    public void setSuperAbilityType(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }
}







