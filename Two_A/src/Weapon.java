public interface Weapon {
    void use();
}

class BasicWeapon implements Weapon {
    @Override
    public void use() {
        System.out.println("Using basic weapon!");
    }
}

class AdvancedWeapon implements Weapon {
    @Override
    public void use() {
        System.out.println("Using advanced weapon!");
    }
}

