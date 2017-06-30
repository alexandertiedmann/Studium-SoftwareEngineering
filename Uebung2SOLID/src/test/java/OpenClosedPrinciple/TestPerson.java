package OpenClosedPrinciple;

import junit.framework.TestCase;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.05.2017
 */
public class TestPerson extends TestCase {
  public void testSaveXML(){
    Person p1 = new Person("Heinrich",new XMLStorage());
    Person p2 = new Person("Frieda",new XMLStorage());
    try {
      String sav1 = p1.save();
      String sav2 = p2.save();
    }catch (Exception e){
      fail();
    }
  }
}
