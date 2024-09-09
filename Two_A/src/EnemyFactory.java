public abstract class EnemyFactory {
    public abstract Enemy createEnemy();

    public static EnemyFactory getFactory(int level) {
        if (level < 5) {
            return new EasyEnemyFactory();
        } else {
            return new HardEnemyFactory();
        }
    }
}

class EasyEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new EasyEnemy();
    }
}

class HardEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new HardEnemy();
    }
}

