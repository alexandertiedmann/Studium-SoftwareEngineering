package de.htw.su;

import junit.framework.TestCase;

/**
 * Test for Employee
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.05.2017
 */
public class TestEmployee extends TestCase{
  public void testCalculateSalary() throws Exception{
    Employee p1 = new Employee("Test",EmployeeCategory.JUNIOR, 1000);
    assertTrue(p1.calculateSalary() == 2000);
  }
}
