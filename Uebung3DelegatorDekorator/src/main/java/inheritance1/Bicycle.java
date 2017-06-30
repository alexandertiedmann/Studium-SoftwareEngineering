package inheritance1;

public class Bicycle extends AVehicle {
	
	private final int numberWheels = 2;
	
	
	@Override
	public double getMaxVelocity(double totalMass) {
		// Only a dummy return. Not important for our context.
		return super.getMaxVelocity(totalMass)-1;
	}
	
	public int getNumberWheels() {
		return numberWheels;
	}
/*
	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	}
*/
}
