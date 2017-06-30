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
package inheritance2.test;

import inheritance2.Vehicle.*;
import inheritance2.VehicleDrive.*;
import inheritance2.VehicleMovement.*;
import inheritance2.VehicleUse.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.fail;

public class VehicleMethodsTest {
  private static UpperClassCar cmcar, emcar;
  private static PropellerPlane emplane;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    cmcar = new UpperClassCar("Test", new DrivingMovement(), new CombustionMotor(), new CargoTransportation());
    emcar = new UpperClassCar("Test", new DrivingMovement(), new ElectricMotor(), new PassengerTransportation());
    emplane = new PropellerPlane("Test", new FlightMovement(), new ElectricMotor(), new PassengerTransportation());
  }

  @Test
  public void testCalculateSpeedup() throws Exception {
    double spup = emcar.calculateSpeedUp();
    assertTrue(spup == 0.0);
  }

  @Test
  public void testCalculatePollutantConcentration() throws Exception {
    CombustionMotor cM = new CombustionMotor();
    try {
      cM.calculatePollutantConcentration(cmcar);
    } catch (Exception e) {
      fail();
    }
  }

  @Test
  public void testCalculateOperatingDistance() throws Exception {
    ElectricMotor eM = new ElectricMotor();
    try {
      eM.calculateOperatingDistance(emcar);
    } catch (Exception e) {
      fail();
    }
  }

  @Test
  public void testCalculateAverageUsefulLife() throws Exception {
    PassengerTransportation pt = new PassengerTransportation();
    double ul = pt.calculateAverageUsefulLife(emplane);
    assertTrue(ul == 0.0);
  }

  @Test
  public void testGetLoadCapacity() throws Exception {
    CargoTransportation ct = new CargoTransportation();
    try {
      ct.getLoadCapacity(cmcar);
    }catch (Exception e){
      fail();
    }
  }

  @Test
  public void testGetMaxNumberPassengers()  throws Exception{
    PassengerTransportation pt = new PassengerTransportation();
    try {
      pt.getMaxNumberPassengers(emplane);
    }catch (Exception e){
      fail();
    }
  }

  @Test
  public void testCalculateCostsOfMovement() throws Exception{
    double costs = emplane.calculateCostsOfMovement();
    assertTrue(costs == 0.0);
  }

  @Test
  public void testCalculateTimeOfMovement() throws Exception{
    double time = emplane.calculateTimeOfMovement();
    assertTrue(time == 0.0);
  }

  @Test
  public void testCalculateSpecificDrivingParameter() throws Exception{
    DrivingMovement dm = new DrivingMovement();
    try {
      dm.calculateSpecificDrivingParameter(cmcar);
    }catch (Exception e){
      fail();
    }
  }

  @Test
  public void testCalculateSpecificFlightParameter() throws Exception{
    double flight = emplane.calculateSpecificFlightParameter();
    assertTrue(flight == 100);
  }
}
