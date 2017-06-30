package inheritance2.VehicleMovement;

import inheritance2.Vehicle.AVehicle;

/**
 * Abstract upper class for the different kinds of movement of vehicles.
 * <br /><br />* 
 * @author Dierk Langbein
 */

public abstract class AMovement {
	
	/* Abstract methods which must be implemented in the sub classes
	 * 
	*/
	abstract public double calculateCostsOfMovement (final AVehicle vehicle);
	abstract public double calculateTimeOfMovement (final AVehicle vehicle);
}
