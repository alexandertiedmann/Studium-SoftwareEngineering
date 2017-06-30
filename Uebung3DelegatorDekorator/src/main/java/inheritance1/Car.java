package inheritance1;

public abstract class Car extends AVehicle implements ICar {
		
	private int numberCarDoors;
	private double torque;
	
		
	@Override
	public double getMaxVelocity(double totalMass) {
		// Only a dummy return. Not important for our context.
		return super.getMaxVelocity(totalMass) + 100;
	}

	@Override  // from ICar
	public int getNumberCarDoors() {		
		return numberCarDoors;
	}
	
	// A special method of Car - assumption: must be modified
	public double calculateTorque() {		
		return torque + 1000;
	}
	public void setTorque (double torque) {
		this.torque = torque;
	}
		
	public double getTorque() {
			return this.torque;
		
	}
}
