package inheritance2.VehicleUse;

import inheritance2.Vehicle.AVehicle;

/**
 * Subclass for the use of vehicles as passenger transport vehicle.
 * <br /><br />
 * @author Dierk Langbein
 */

public class PassengerTransportation extends AUse {
	
	/* Concrete method implementation in the subclass
	 * 
	*/
	@Override
	public double calculateAverageUsefulLife (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Overwritten method 'calculateAverageUsefulLife' in class 'PassengerTransportation' called. Return:" +
				vehicle.getMotorPower() * 3);
		return (vehicle.getMotorPower() * 3); 
	}	
	
	public void getMaxNumberPassengers (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Specific method 'getMaxNumberPassengers' in class 'PassengerTransportation' called.");
	}
}
