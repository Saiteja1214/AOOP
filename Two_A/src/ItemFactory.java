public abstract class ItemFactory {
    public abstract Weapon createWeapon();
    public abstract PowerUp createPowerUp();

    public static ItemFactory getFactory(int level) {
        if (level < 5) {
            return new BasicItemFactory();
        } else {
            return new AdvancedItemFactory();
        }
    }
}

class BasicItemFactory extends ItemFactory {
    @Override
    public Weapon createWeapon() {
        return new BasicWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new SpeedBoost();
    }
}

class AdvancedItemFactory extends ItemFactory {
    @Override
    public Weapon createWeapon() {
        return new AdvancedWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new Shield();
    }
}

