package SingleResponsibilityPrinciple.loesung;

import java.io.IOException;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.05.2017
 */
public class DocumentService {
  private DocumentPersistenceAdapter SaveLoad;

  public void acceptDocument(SimpleDocument doc) {
    try {
      if (doc.isApprovalStatus()) {
        SaveLoad.save(doc);
      } else {
        throw new IOException("Es ist ein Fehler augetreten");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
