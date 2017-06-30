package inheritance2.VehicleUse;

import inheritance2.Vehicle.AVehicle;

/**
 * Abstract upper class for the different kinds of uses  of vehicles.
 * <br /><br />* 
 * @author Dierk Langbein
 */

public abstract class AUse {
	
	/* Abstract method which must be implemented in the sub classes
	 * 
	*/
	abstract public double calculateAverageUsefulLife (final AVehicle vehicle);	
}
