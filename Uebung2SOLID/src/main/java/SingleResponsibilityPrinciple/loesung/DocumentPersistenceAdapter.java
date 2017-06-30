package SingleResponsibilityPrinciple.loesung;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.05.2017
 */
public class DocumentPersistenceAdapter implements ISaveLoadDocument {
  private final String PERS_TYPE = "doc";
  private SerializablePersister<SimpleDocument> persister;

  public DocumentPersistenceAdapter(SerializablePersister<SimpleDocument> sp) {
    persister = sp;
  }

  @Override
  public void save(SimpleDocument doc) throws RuntimeException {
    persister.save(doc, PERS_TYPE, doc.getDocNumber());
  }

  @Override
  public SimpleDocument load(Integer docNumber) {
    return persister.load(PERS_TYPE, docNumber);
  }
}
