public interface Enemy {
    void attack();
}

class EasyEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Easy Enemy attacks with low damage!");
    }
}

class HardEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Hard Enemy attacks with high damage!");
    }
}

