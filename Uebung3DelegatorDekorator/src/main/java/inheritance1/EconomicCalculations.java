package inheritance1;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 23.05.2017
 */
public class EconomicCalculations extends ACalculations {

  public EconomicCalculations(AVehicle aVehicle) {
    wrappedVehicle = aVehicle;
  }

  public double calculateAverageUsefulLife() {
    return 0.0;
  }
}
