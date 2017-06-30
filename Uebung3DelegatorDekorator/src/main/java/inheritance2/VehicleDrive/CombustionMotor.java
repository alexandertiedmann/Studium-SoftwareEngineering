package inheritance2.VehicleDrive;

import inheritance2.Vehicle.AVehicle;

/**
 * Subclass for the drive of vehicles by using a combustion motor.
 * <br /><br />
 * 
 * @author Dierk Langbein
 */

public class CombustionMotor extends ADrive {
	
	/* Concrete method implementation in the subclass
	 * 
	*/
	@Override
	public double calculateSpeedUp (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Overwritten method 'calculateSpeedUp' in class 'CombustionMotor' called. Return: " + vehicle.getMotorPower() * 3);
		return vehicle.getMotorPower() * 3;
			
	}	
	
	/*
	@Override
	public double calculateEnergyEfficiency (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Overwritten method'calculateEnergyEfficiency' in class 'CombustionMotor' called.");
	}
	*/
	
	/*
	 * A specific method for calculating the pollutant concentration of a combustion motor.
	 */
	public void calculatePollutantConcentration (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Specific method 'calculatePollutantConcentration' in class 'CombustionMotor' called.");
	}
}
