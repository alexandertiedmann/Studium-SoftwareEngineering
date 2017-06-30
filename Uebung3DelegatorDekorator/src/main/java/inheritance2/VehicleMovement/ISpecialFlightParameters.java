package inheritance2.VehicleMovement;

import inheritance2.Vehicle.AVehicle;


/**
 * Interface for calculating specific parameters of flight movement of vehicles.
 * <br /><br />* 
 * @author Dierk Langbein
 */

public interface ISpecialFlightParameters {
	
	/* Abstract methods which must be implemented in the classes
	 * 
	*/
	abstract public double calculateSpecificFlightParameter (AVehicle vehicle);

}
