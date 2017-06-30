package SingleResponsibilityPrinciple.loesung;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.05.2017
 */
public interface ISaveLoadDocument {
  public void save(SimpleDocument doc);
  public SimpleDocument load (Integer docNumber);
}
