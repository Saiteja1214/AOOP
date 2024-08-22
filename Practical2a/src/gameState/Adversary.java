package gameState;

public class Adversary {
	 public void Attack() {
	}
	}
	class SimpleAdversary extends Adversary {
	    @Override
	    public void Attack() {
	        System.out.println("Simple adversary will launch attack");
	    }
	}

	class ModerateAdversary extends Adversary {
	    @Override
	    public void Attack() {
	        System.out.println("Moderate adversary will launch an attack");
	    }
	}

	class DifficultAdversary extends Adversary {
	    @Override
	    public void Attack() {
	        System.out.println("Difficult adversary launches an attack");
	    }
	}

	abstract class AdversaryFactory {
	    public abstract Adversary generateAdversary();
	}

	class SimpleAdversaryFactory extends AdversaryFactory {
	    @Override
	    public Adversary generateAdversary() {
	        return new SimpleAdversary();
	    }
	}

	class ModerateAdversaryFactory extends AdversaryFactory {
	    @Override
	    public Adversary generateAdversary() {
	        return new ModerateAdversary();
	    }
	}

	class DifficultAdversaryFactory extends AdversaryFactory {
	    @Override
	    public Adversary generateAdversary() {
	        return new DifficultAdversary();
	    }
	
}
