package inheritance2.Vehicle;

import inheritance2.VehicleDrive.ADrive;
import inheritance2.VehicleMovement.AMovement;
import inheritance2.VehicleMovement.FlightMovement;
import inheritance2.VehicleUse.AUse;

public class PropellerPlane extends AVehicle {
	private String name;	
	private int numberMotors;
	private int numberSeatings;	
	
	private AMovement movement;
	private ADrive drive;
	private AUse use;
	
	public PropellerPlane(String name, AMovement movement, ADrive drive, AUse use) {
		// TODO: Reject null 
		this.setName(name);
		this.movement = movement;
		this.drive = drive;
		this.use = use;
	}
	
	public double calculateCostsOfMovement() {
		return this.movement.calculateCostsOfMovement(this);
	}
	public double calculateTimeOfMovement() {
		return this.movement.calculateTimeOfMovement(this);
	}
	
	public double calculateSpeedUp() {
		return this.drive.calculateSpeedUp(this);
	}
	public double calculateAverageUsefulLife() {
		return this.use.calculateAverageUsefulLife(this);
	}
	public double calculateSpecificFlightParameter (){
		return ((FlightMovement) this.movement).calculateSpecificFlightParameter(this);
	}
	
	// A special method of PropellerPlane
	public double calculateReach (int numberMotors, int numberSeatings) {
		//body for demonstration purposes
		System.out.println("Special method 'calculateReach' in class 'PropellerPlane' called. Return: " + this.numberMotors + this.numberSeatings);
		return this.numberMotors + this.numberSeatings;
		
	}	

	public int getNumberMotors() {
		return numberMotors;
	}
	public void setNumberMotors(int numberMotors) {
		this.numberMotors = numberMotors;
	}
	public int getNumberSeatings() {
		return numberSeatings;
	}
	public void setNumberSeatings(int numberSeatings) {
		this.numberSeatings = numberSeatings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getTotalMass() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMaxVelocity(double totalMass) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getOperatingCosts(double numberWheels) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
