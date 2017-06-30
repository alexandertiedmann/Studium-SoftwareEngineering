package inheritance1;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 23.05.2017
 */
public class EnvironmentalCalculations extends ACalculations{

  public EnvironmentalCalculations(AVehicle aVehicle){
    wrappedVehicle = aVehicle;
  }

  public double calculateEnergyEfficiency(double totalMass){
    return totalMass/20;
  }
}
