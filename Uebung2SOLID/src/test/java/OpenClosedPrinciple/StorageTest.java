/*
 * Liskov Substitution Principle test - demonstrates the L-principle in SOLID 
 * 
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
package OpenClosedPrinciple;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

// TODO: Import the nessecary classes.

/**
 * Demonstration test - demonstrates Liskov Substitution Principle
 *
 * @author <a href="mailto:Dierk.Langbein(a/t)htw-berlin.de">Dierk Langbein</a>
 */
public class StorageTest {

  /**
   * logger
   */
  private static final Logger LOGGER = Logger.getLogger(StorageTest.class.getName());

  /**
   * Log-level for this test
   */
  private static final Level LOG_LEVEL = Level.FINE;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    LogUtils.setConsoleHandlerLogLevel(LOG_LEVEL);
    LogUtils.setLogLevel(LOG_LEVEL, StorageTest.class, Person.class, Customer.class,
      Storage.class, XMLStorage.class);
  }

  @Test
  public void testSaveCustomer() throws Exception {

    LOGGER.info("Test the save method in class 'FileStorage', access from 'Customer'");
    long startTimeNanos = System.nanoTime();
    Customer customer = new Customer();
    customer.setName("<lastname>Urbino<lastname>");

    String receivedResult = customer.save(customer.getName(), 1);

    String expectedResult = "<lastname>Urbino<lastname> saved in a file.";

    assertEquals(expectedResult, receivedResult);

    LOGGER.info("Test save with method in class 'FileStorage' successful! Elapsed time: "
      + MiscUtils.formatNanosAsSeconds(System.nanoTime() - startTimeNanos) + " s");
  }

  @Test
  public void testSavePerson() throws Exception {

    LOGGER.info("Test the save method in sub class 'XMLStorage', access from 'Person'");
    long startTimeNanos = System.nanoTime();
    Person person = new Person();
    person.setName("<lastname>Urbino<lastname>");
    Storage storage = new Storage().createStorage(StorageType.XML);
    person.setStorage(storage);

    String receivedResult = person.save();

    String expectedResult = "<lastname>Urbino<lastname> saved in a XML file.";

    assertEquals(expectedResult, receivedResult);

    LOGGER.info("Test save method in sub class 'StorageDatabase' successful! Elapsed time: "
      + MiscUtils.formatNanosAsSeconds(System.nanoTime() - startTimeNanos) + " s");
  }
}
