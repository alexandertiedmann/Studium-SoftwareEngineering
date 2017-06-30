package inheritance2.Vehicle;

/*
 * A vehicle can move in different kinds, it can use different kinds of drive and it can transport persons or cargos.
 * <br /><br />* 
 * @author Dierk Langbein
 */

public abstract class AVehicle {
	private double motorPower;
	private double ownWeight;
	
	 
	public abstract double getTotalMass();
	
	public abstract double getMaxVelocity(double totalMass);
		
	public abstract double getOperatingCosts(double numberWheels);		

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
}
