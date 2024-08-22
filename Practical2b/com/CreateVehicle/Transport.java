package com.CreateVehicle;

public interface Transport {
	void operate();
	}


	class Automobile implements Transport {
	    @Override
	    public void operate() {
	        System.out.println("Driving an automobile...");
	    }
	}


	class TwoWheeler implements Transport {
	    @Override
	    public void operate() {
	        System.out.println("Riding a two-wheeler...");
	    }
	}


	class MotorScooter implements Transport {
	    @Override
	    public void operate() {
	        System.out.println("Scootering on a motor scooter...");
	    }
	}


	abstract class TransportFactory {
	    abstract Transport buildTransport();
	}


	class CarFactory extends TransportFactory {
	    @Override
	    Transport buildTransport() {
	        return new Automobile();
	    }
	}


	class BikeFactory extends TransportFactory {
	    @Override
	    Transport buildTransport() {
	        return new TwoWheeler();
	    }
	}


	class ScooterFactory extends TransportFactory {
	    @Override
	    Transport buildTransport() {
	        return new MotorScooter();
	    }
}
