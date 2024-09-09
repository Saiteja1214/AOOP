public interface PowerUp {
    void activate();
}

class SpeedBoost implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Speed boost activated!");
    }
}

class Shield implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Shield activated!");
    }
}
