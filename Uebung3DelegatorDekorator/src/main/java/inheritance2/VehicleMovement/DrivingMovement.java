package inheritance2.VehicleMovement;

import inheritance2.Vehicle.AVehicle;

/**
 * Subclass for the driving movement of vehicles.
 * <br /><br />
 * 
 * @author Dierk Langbein
 */

public class DrivingMovement extends AMovement {
	
	/* Concrete method implementation in the subclass
	 * 
	*/
	@Override
	public double calculateCostsOfMovement (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Overwritten method 'calculateCostsOfMovement' in class 'DrivingMovement' called. Return: " + vehicle.getMotorPower()+100);
		return vehicle.getMotorPower()+1000;
	}	
	
	@Override
	public double calculateTimeOfMovement (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Overwritten method'calculateTimeOfMovement' in class 'DrivingMovement' called. Return: " + vehicle.getMotorPower()*100);
		return vehicle.getMotorPower()*100;
	}
	
	public void calculateSpecificDrivingParameter (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Specific method 'calculateSpecificDrivingParameter' in class 'DrivingMovement' called.");
	}
}
