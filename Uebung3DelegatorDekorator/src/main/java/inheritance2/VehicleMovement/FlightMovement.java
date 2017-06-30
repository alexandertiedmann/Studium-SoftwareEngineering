package inheritance2.VehicleMovement;

import inheritance2.Vehicle.AVehicle;

/**
 * Subclass for the flight movement of vehicles.
 * <br /><br />
 * @author Dierk Langbein
 */

public class FlightMovement extends AMovement implements ISpecialFlightParameters {
	private double totalMass;
	
	/* Concrete method implementation in the subclasses
	 * 
	*/
	@Override
	public double calculateCostsOfMovement (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Overwritten method 'calculateCostsOfMovement' in class 'FlightMovement' called.");
		return vehicle.getOwnWeight() * 2;
	}	
	
	@Override
	public double calculateTimeOfMovement (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Overwritten method'calculateTimeOfMovement' in class 'FlightMovement' called.");
		return vehicle.getMaxVelocity(totalMass);
	}
	
	@Override
	public double calculateSpecificFlightParameter (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Specific method 'calculateSpecificFlightParameter' in class 'FlightMovement' called. Value: "
				+ 100);
		return 100;
	}
}
