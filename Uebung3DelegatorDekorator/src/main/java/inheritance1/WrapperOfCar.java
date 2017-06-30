package inheritance1;

public class WrapperOfCar extends AVehicle {	
	
	private final Car wrappedCar;;
	private double torque;
	
	public WrapperOfCar (final Car aCar) {
		
		if (aCar == null)
			throw new IllegalArgumentException("Car must not be null!");
		
		this.wrappedCar = aCar;
	}
	
	@Override
	public double getMaxVelocity(double totalMass) {		
		return wrappedCar.getMaxVelocity(totalMass);
	}
	
	
	// The modified method from class 'Car' or an additional method
	public double calculateTorqueNewInWrapperOfCar() {
		// Some new calculations ...
		return torque + 2000;
	}
		
	public double getTorque() {
		return wrappedCar.getTorque();
	}
	public void setTorque() {
		this.torque = wrappedCar.getTorque();
	}
}
