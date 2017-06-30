package SingleResponsibilityPrinciple.loesung;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.05.2017
 */
public class SimpleDocument {
  private int docNumber;
  private String docTitle;
  private String docType;
  private boolean approvalStatus;

  public boolean isApprovalStatus() {
    // In the current teaching context "pattern" a document contentCheck is only simulated.
    if ((this.docTitle.trim().length() < 5) || (this.docNumber < 0)) {
      //	LOGGER.info("document with number " + Simpledocument.docNumber + " has not a correct title.");
      approvalStatus = false;
    } else {
      //LOGGER.info("document with number " + Simpledocument.docNumber + " has a correct title.");
      approvalStatus = true;
    }
    return approvalStatus;
  }

  public String getDocTitle() {
    return docTitle;
  }

  public String docType() {
    return docType;
  }

  public int getDocNumber() {
    return docNumber;
  }
}
