package inheritance1;

public abstract class AVehicle {
	private double motorPower;
	private double ownWeight;
	private double vehiclePayload;
	private int numberWheels;
	private double totalMass;
 
	public double getTotalMass() {
		// Only a dummy return. Not important for our context.
		return this.totalMass;
    //return ownWeight+vehiclePayload;
	}
	
	public double getMaxVelocity(double totalMass) {
		// Only a dummy return. Not important for our context.
		return 1000/totalMass;
	}
	public double getOperatingCosts(double numberWheels) {
		// Only a dummy return. Not important for our context.
		return numberWheels * 100;
	}
	//public abstract double getOperatingCosts1(double numberWheels);
	

	public double getMotorPower() {
		return motorPower;
	}

	public void setMotorPower(double motorPower) {
		this.motorPower = motorPower;
	}

	public double getOwnWeight() {
		return ownWeight;
	}

	public void setOwnWeight(double ownWeight) {
		this.ownWeight = ownWeight;
	}

	public int getNumberWheels() {
		return numberWheels;
	}

	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	}

	public void setTotalMass(int totalMass) {
		this.totalMass = totalMass;
	  //this.totalMass = ownWeight+vehiclePayload;
	}	
}
