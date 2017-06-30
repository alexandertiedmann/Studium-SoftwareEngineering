package inheritance2.VehicleDrive;

import inheritance2.Vehicle.AVehicle;

/**
 * Abstract upper class for the different kinds of drive of vehicles.
 * <br /><br />* 
 * @author Dierk Langbein
 */

public abstract class ADrive {
	
	/* Abstract methods which must be implemented in the sub classes
	 * 
	*/
	abstract public double calculateSpeedUp (final AVehicle vehicle);
	//abstract public double calculateEnergyEfficiency (final AVehicle vehicle);
}
