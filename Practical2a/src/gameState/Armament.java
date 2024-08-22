package gameState;

abstract class Armament {
    public abstract void deploy();
}

class Blade extends Armament {
    @Override
    public void deploy() {
        System.out.println("Wielding a blade!");
    }
}

class Firearm extends Armament {
    @Override
    public void deploy() {
        System.out.println("Firing a firearm!");
    }
}

abstract class Enhancement {
    public abstract void trigger();
}

class HealthEnhancement extends Enhancement {
    @Override
    public void trigger() {
        System.out.println("Health enhancement triggered!");
    }
}

class SpeedEnhancement extends Enhancement {
    @Override
    public void trigger() {
        System.out.println("Speed enhancement triggered!");
    }
}

abstract class GameComponentFactory {
    public abstract Armament createArmament();
    public abstract Enhancement createEnhancement();
}

class NoviceLevelFactory extends GameComponentFactory {
    @Override
    public Armament createArmament() {
        return new Blade();
    }

    @Override
    public Enhancement createEnhancement() {
        return new HealthEnhancement();
    }
}

class ExpertLevelFactory extends GameComponentFactory {
    @Override
    public Armament createArmament() {
        return new Firearm();
    }

    @Override
    public Enhancement createEnhancement() {
        return new SpeedEnhancement();
    }
}