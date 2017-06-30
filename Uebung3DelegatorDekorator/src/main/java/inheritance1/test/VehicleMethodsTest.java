/*
 * Some tests - demonstrates INHERITANCE and DECORATOR
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package inheritance1.test;

import inheritance1.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;


/**
 * Dependency injection test - demonstrates INHERITANCE and DECORATOR
 *
 * @author <a href="mailto:Dierk.Langbein(a/t)htw-berlin.de">Dierk Langbein</a>
 */

public class VehicleMethodsTest {

  /**
   * logger
   */

  private static final Logger LOGGER = Logger.getLogger(VehicleMethodsTest.class.getName());


  /**
   * Log-level for this test
   */

  private static final Level LOG_LEVEL = Level.FINE;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    LogUtils.setConsoleHandlerLogLevel(LOG_LEVEL);
    LogUtils.setLogLevel(LOG_LEVEL, VehicleMethodsTest.class);
  }

  @Test
  public void testVehicleMethods() throws Exception {

    // Hint: set the log-level above to FINE to see DEPENDENCY INJECTION working.
    LOGGER.info("Test a Vehicle-method ...");
    long startTimeNanos = System.nanoTime();

    LowerClassCar lc = new LowerClassCar();
    lc.setNumberWheels(4);
    //getOperatingCosts is defined in AVehicle ...
    lc.getOperatingCosts(lc.getNumberWheels());
    System.out.println("numberWheels in class 'LowerClassCar': " + lc.getNumberWheels());

    double receivedResult = lc.getOperatingCosts(lc.getNumberWheels());
    ;
    double expectedResult = 400;

    LOGGER.info("numberWheels: " + lc.getNumberWheels());
    LOGGER.info("Received result: " + receivedResult);
    LOGGER.info("Expected result: " + expectedResult);

    assertEquals(expectedResult, receivedResult, 0.0);

    LOGGER.info("Test of the Vehicle-Method successful! Elapsed time: "
              + MiscUtils.formatNanosAsSeconds(System.nanoTime() - startTimeNanos) + " s");
  }

  @Test
  public void testWrapperMethods() throws Exception {

    // Hint: set the log-level above to FINE to see DEPENDENCY INJECTION working.
    LOGGER.info("Test a wrapper method in 'WrapperOfCar' ...");
    long startTimeNanos = System.nanoTime();
             

/* Use of the concrete decorator WrapperOfCar */

    LowerClassCar lc = new LowerClassCar();
    WrapperOfCar wr = new WrapperOfCar(lc);
    wr.setTorque();
    wr.getMaxVelocity(50);

    double receivedResult = wr.calculateTorqueNewInWrapperOfCar();
    double expectedResult = 2000;

    LOGGER.info("torque: " + wr.getTorque());
    LOGGER.info("Received result: " + receivedResult);
    LOGGER.info("Expected result: " + expectedResult);

    assertEquals(expectedResult, receivedResult, 0.0);

    LOGGER.info("Test of Wrapper-method successful! Elapsed time: "
              + MiscUtils.formatNanosAsSeconds(System.nanoTime() - startTimeNanos) + " s");
  }

  @Test
  public void testDecoratorMethods() throws Exception {

    // Hint: set the log-level above to FINE to see DEPENDENCY INJECTION working.
    LOGGER.info("Test a Decorator-method in a concrete wrapper class ...");
    long startTimeNanos = System.nanoTime();

    //Ship ship = new Ship();
    UpperClassCar uc = new UpperClassCar();
        

/* Use of the concrete decorator EnvironmentalCalculations */

    //EnvironmentalCalculations ec = new EnvironmentalCalculations(ship);
    EnvironmentalCalculations ec = new EnvironmentalCalculations(uc);
    ec.setTotalMass(20000);
    //an inherited method from AVehicle:
    ec.getMaxVelocity(ec.getTotalMass());
    // the additional method
    double receivedResult = ec.calculateEnergyEfficiency(ec.getTotalMass());
    double expectedResult = 1000;
    LOGGER.info("totalMass: " + ec.getTotalMass());
    LOGGER.info("Received result: " + receivedResult);
    LOGGER.info("Expected result: " + expectedResult);

    assertEquals(expectedResult, receivedResult, 0.0);

    LOGGER.info("Test of Decorator-method successful! Elapsed time: "
             + MiscUtils.formatNanosAsSeconds(System.nanoTime() - startTimeNanos) + " s");
  }
}
