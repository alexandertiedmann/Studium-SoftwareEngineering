package inheritance2.Vehicle;

import inheritance2.VehicleMovement.AMovement;
import inheritance2.VehicleDrive.ADrive;
import inheritance2.VehicleUse.AUse;

public class UpperClassCar extends Car  {
	private String name;
	private int numberSeatings;
	private AMovement movement;
	private ADrive drive;
	private AUse use;
	
	public UpperClassCar(String name, AMovement movement, ADrive drive, AUse use) {
		// TODO: Reject null 
		this.name = name;
		this.movement = movement;
		this.drive = drive;
		this.use = use;
	}
	
	public double calculateCostsOfMovement() {
		return this.movement.calculateCostsOfMovement(this);
	}
	public double calculateSpeedUp() {
		return this.drive.calculateSpeedUp(this);
	}
	public double calculateAverageUsefulLife() {
		return this.use.calculateAverageUsefulLife(this);
	}
	
	public int getNumberSeatings() {
		return numberSeatings;
	}

	public void setNumberSeatings(int numberSeatings) {
		this.numberSeatings = numberSeatings;
	}
	
	@Override
	public double getTotalMass() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getOperatingCosts(double numberWheels) {
		// TODO Auto-generated method stub
		return 0;
	}
		
	@Override
	public double getMaxVelocity(double totalMass) {
		System.out.println("Overwritten method 'getMaxVelocity' in subclass 'UpperClassCar' called. Value: 100");
		// Only a dummy return. Not important for our context.
		return  100;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AMovement getMovement() {
		return movement;
	}

	public void setMovement(AMovement movement) {
		this.movement = movement;
	}

	public ADrive getDrive() {
		return drive;
	}

	public void setDrive(ADrive drive) {
		this.drive = drive;
	}

	public AUse getUse() {
		return use;
	}

	public void setUse(AUse use) {
		this.use = use;
	}
}
