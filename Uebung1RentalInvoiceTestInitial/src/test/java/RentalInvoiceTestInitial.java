/*
 * The current class demonstrates necessary test cases.
 * Code example for teaching purposes
 * Copyright 2017 Dierk Langbein
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

import data.BookInitial;
import data.CustomerInitial;
import data.PriceCode;
import data.RentalInitial;
import util.LogUtils;
import util.MiscUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for method "createRentalInvoice()"
 *
 * @author <a href="mailto:Dierk.Langbein(a/t)htw-berlin.de">Dierk Langbein</a>
 */
public class RentalInvoiceTestInitial {

  /**
   * logger
   */
  protected static final Logger LOGGER = Logger.getLogger(RentalInvoiceTestInitial.class.getName());

  /**
   * Log-level for this test
   */
  private static final Level LOG_LEVEL = Level.FINE;

  /**
   * For the test cases we simulate some kind of registry.
   */
  protected static final HashMap<PriceCode, RentalInitial> RENTAL_REGISTRY = new HashMap<>();


  /**
   * Keys for price codes to handle different rental types.
   */

  private static final PriceCode REGULAR = PriceCode.REGULAR;
  private static final PriceCode CHILDREN = PriceCode.CHILDREN;
  private static final PriceCode NEW_RELEASE = PriceCode.NEW_RELEASE;

  /**
   * Keys for days rented.
   */

  private static final int TWO_DAYS_RENTED = 2;
  private static final int THREE_DAYS_RENTED = 3;
  private static final int FOUR_DAYS_RENTED = 4;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    LogUtils.setConsoleHandlerLogLevel(LOG_LEVEL);
    LogUtils.setLogLevel(LOG_LEVEL, BookInitial.class, RentalInitial.class, CustomerInitial.class);
  }

  @Before
  public void setUp() throws Exception {
    RENTAL_REGISTRY.put(REGULAR, new RentalInitial(new BookInitial("ComputerScienceHandbook", REGULAR), THREE_DAYS_RENTED));
    RENTAL_REGISTRY.put(CHILDREN, new RentalInitial(new BookInitial("ComputerScienceForChildren", CHILDREN), FOUR_DAYS_RENTED));
    RENTAL_REGISTRY.put(NEW_RELEASE, new RentalInitial(new BookInitial("ComputerScienceForEverybody", NEW_RELEASE), TWO_DAYS_RENTED));
  }

  @Test
  public void testCreateRentalInvoice() {

    // Hint: set the log-level above to FINE to see createRentalInvoice at work.

    LOGGER.info("Test method 'CreateRentalInvoice()' ...");
    long startTimeNanos = System.nanoTime();

    PriceCode[] priceCodes = new PriceCode[]{REGULAR, CHILDREN, NEW_RELEASE};
    CustomerInitial customer = new CustomerInitial("Tester");
    LOGGER.info("customer name: " + customer.getName());

    for (PriceCode priceCodeKey : priceCodes) {
      customer.addRental(RENTAL_REGISTRY.get(priceCodeKey));
      LOGGER.info("price code: " + RENTAL_REGISTRY.get(priceCodeKey));
    }

    String receivedResult = customer.statement();

    String expectedResult = "Rental record for Tester" + "\n";
    expectedResult += "\t" + "ComputerScienceHandbook" + "\t" + "3.5" + "\n";
    expectedResult += "\t" + "ComputerScienceForChildren" + "\t" + "3.0" + "\n";
    expectedResult += "\t" + "ComputerScienceForEverybody" + "\t" + "6.0" + "\n";
    expectedResult += "Amount owed is " + "12.5" + "." + "\n";
    expectedResult += "You earned " + "4" + " frequent renter points.";

    LOGGER.info(receivedResult);
    LOGGER.info(expectedResult);

    assertEquals(expectedResult, receivedResult);
        /*
        // Test of the HTML output method
        String receivedResultHTML = customer.createRentalInvoiceHTML();
        
        String expectedResultHTML = "<H1>Rental record for <EM>Tester</EM></H1>" + "\n";
        expectedResultHTML += "\t" + "ComputerScienceHandbook" + "\t" + "3.5<BR>" + "\n";
        expectedResultHTML += "\t" + "ComputerScienceForChildren" + "\t" + "3.0<BR>" + "\n";
        expectedResultHTML += "\t" + "ComputerScienceForEverybody" + "\t" + "6.0<BR>" + "\n";				
        expectedResultHTML += "<p>Amount owed is " + "<EM>12.5" + "." + "\n";
        expectedResultHTML += "You earned " + "4</EM>" + " frequent renter points.</p>";
        
        LOGGER.info(receivedResultHTML);
        LOGGER.info(expectedResultHTML);               

        assertEquals(expectedResultHTML, receivedResultHTML);
		*/
    LOGGER.info("Test method 'CreateRentalInvoice()' successful! Elapsed time: "
      + MiscUtils.formatNanosAsSeconds(System.nanoTime() - startTimeNanos) + " s");
  }
}
