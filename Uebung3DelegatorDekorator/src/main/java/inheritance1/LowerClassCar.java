package inheritance1;

public class LowerClassCar extends Car  {
	
	private int numberSeatings = 2;
	private double torque;
	
	public LowerClassCar() {}
	
	@Override
	public double getMaxVelocity(double totalMass) {
		// Only a dummy return. Not important for our context.
		return super.getMaxVelocity(totalMass) - 10;
	}
	public double calculateTorque() {		
		return torque + 20;
	}
	
	public int getNumberSeatings() {
		return numberSeatings;
	}

	public void setNumberSeatings(int numberSeatings) {
		this.numberSeatings = numberSeatings;
	}
	public double getTorque() {
		return torque;
	}
	public void setTorque(double torque) {
		this.torque = torque;
	}
}
