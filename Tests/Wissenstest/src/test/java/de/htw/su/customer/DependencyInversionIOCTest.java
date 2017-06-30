
/*
 * Dependency injection test - demonstrates DEPENDENCY INVERSION
 */
package de.htw.su.customer;

import de.htw.su.LogUtils;
import de.htw.su.MiscUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

/**
 * Dependency inversion test - demonstrates DEPENDENCY INVERSION
 *
 * @author <a href="mailto:Dierk.Langbein(a/t)htw-berlin.de">Dierk Langbein</a> by using sources of Karl Eilebrecht
 */
public class DependencyInversionIOCTest {

  /**
   * logger
   */
  private static final Logger LOGGER = Logger.getLogger(DependencyInversionIOCTest.class.getName());

  /**
   * Log-level for this test
   */
  private static final Level LOG_LEVEL = Level.FINE;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    LogUtils.setConsoleHandlerLogLevel(LOG_LEVEL);
    LogUtils.setLogLevel(LOG_LEVEL, LOGGER);
  }

  @Test
  public void testSaveIndependent() throws Exception {
    Customer c1 = new Customer();
    String get = c1.saveIndependent(new StorageService(StorageType.XML),"Test");

    String expected = "Test saved in a XML file.";

    assertTrue(expected.equals(get));


    LOGGER.info("Test of the independent save function in 'Customer' successful! Elapsed time: "
      + MiscUtils.formatNanosAsSeconds(System.nanoTime())); // - startTimeNanos) + " s"); //startTimeNanos existiert nicht (woher?)
  }
}
