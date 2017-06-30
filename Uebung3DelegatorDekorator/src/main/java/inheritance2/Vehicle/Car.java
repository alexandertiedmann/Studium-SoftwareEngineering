package inheritance2.Vehicle;

public abstract class Car extends AVehicle {
		
	private int numberWheels;
	private double basisTorque = 1000;
	
		
	// A special method of Car - assumption: must be modified
	public double calculateTorque() {		
		return basisTorque + 1000;
	}
	public void setTorque (double torque) {
		this.basisTorque = torque;
	}
		
	public double getTorque() {
			return this.basisTorque;
		
	}
	public int getNumberWheels() {
		return numberWheels;
	}

	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	}	
}
