public class Warrior extends Hero{
        @Override
        public void applySuperAbility() {
            setDamage(150);
            setHealth(400);
            setSuperAbilityType("SUPER POWER");
            System.out.println("Warrior "+getHealth()+"hp "+getDamage()+"dd применил суперспособность "+getSuperAbilityType());
        }
    }


