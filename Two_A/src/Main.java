public class Main {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();

        for (int i = 1; i <= 6; i++) {
            System.out.println("Level: " + gameState.getLevel());

            EnemyFactory enemyFactory = EnemyFactory.getFactory(gameState.getLevel());
            Enemy enemy = enemyFactory.createEnemy();
            enemy.attack();

            ItemFactory itemFactory = ItemFactory.getFactory(gameState.getLevel());
            Weapon weapon = itemFactory.createWeapon();
            weapon.use();

            PowerUp powerUp = itemFactory.createPowerUp();
            powerUp.activate();

            gameState.addScore(100);
            System.out.println("Score: " + gameState.getScore());

            gameState.advanceLevel();
        }
    }
}
