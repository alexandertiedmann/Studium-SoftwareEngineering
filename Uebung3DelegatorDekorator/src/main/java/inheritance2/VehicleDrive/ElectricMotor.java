package inheritance2.VehicleDrive;

import inheritance2.Vehicle.AVehicle;

/**
 * Subclass for the drive of vehicles by using an electric motor.
 * <br /><br />
 * 
 * @author Dierk Langbein
 */

public class ElectricMotor extends ADrive {
	
	/* Concrete method implementation in the subclass
	 * 
	*/
	@Override
	public double calculateSpeedUp (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Overwritten method 'calculateSpeedUp' in class 'ElectricMotor' called. Return: " + vehicle.getMotorPower() * 5);
		return vehicle.getMotorPower() * 5;
	}	
	/*
	@Override
	public void calculateEnergyEfficiency (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Overwritten method'calculateEnergyEfficiency' in class 'ElectricMotor' called.");
	}
	*/
	/*
	 * A specific method for calculating the pollutant concentration of a combustion motor.
	 */
	public void calculateOperatingDistance (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Specific method 'calculateOperatingDistance' in class 'ElectricMotor' called.");
	}
}
