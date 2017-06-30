package inheritance2.VehicleUse;

import inheritance2.Vehicle.AVehicle;

/**
 * Subclass for the use of vehicles as cargo transport vehicle.
 * <br /><br />
 * @author Dierk Langbein
 */

public class CargoTransportation extends AUse {
	
	/* Concrete method implementation in the subclass
	 * 
	*/
	@Override
	public double calculateAverageUsefulLife (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Overwritten method 'calculateAverageUsefulLife' in class 'CargoTransportation' called. Return:" +
				vehicle.getMotorPower() * 3 +vehicle.getOwnWeight());
		return (vehicle.getMotorPower() * 3 +vehicle.getOwnWeight()); 
	}	
	
	public void getLoadCapacity (final AVehicle vehicle) {
		//body for demonstration purposes
		System.out.println("Specific method 'getLoadCapacity' in class 'CargoTransportation' called.");
	}
}
