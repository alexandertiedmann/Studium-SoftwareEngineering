/*
 * document
 * Code example for teaching purposes
 * Copyright 2016 Dierk Langbein
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
package SingleResponsibilityPrinciple.loesung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Logger;

/**
 * The class "Document" is an example for violating the SRP.
 *
 * @author <a href="mailto:Dierk.Langbein(a/t)htw-berlin.de">Dierk Langbein</a>
 */
public class Document implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * logger
   */
  protected static final Logger LOGGER = Logger.getLogger(Document.class.getName());

  /**
   * The number of the document.
   */
  private int docNumber;

  /**
   * The title of the document.
   */
  private String docTitle;

  /**
   * The type of the document.
   */
  private String docType;
  /**
   * The approval status of the document.
   */
  private boolean approvalStatus;

  /**
   * Creates a new document
   *
   * @param docNumber document number
   * @param docTitle  document title
   * @param docType   document type
   */
  public Document(int docNumber, String docTitle, String docType) {
    // An indication of some validations.
    if (docNumber <= 0 || docTitle == null || docTitle.trim().length() == 0 || docType == null) {
      throw new IllegalArgumentException("Arguments docNumber and numberPages must be > 0, "
        + "docTitle and docType must be specified (given: docNumber=" + docNumber + ", docTitle=" + docTitle
        + ", docType=" + docType + ").");
    }
    this.docNumber = docNumber;
    this.docTitle = docTitle;
    this.docType = docType;
  }

  public Document() {
  }

  @Override
  public String toString() {
    LOGGER.fine("toString() on " + this.getClass().getSimpleName() + " called.");
    return this.getClass().getSimpleName() + "({docNumber = " + this.getDocNumber() + ", docTitle = "
      + this.getDocTitle() + ", docType = " + this.getDocType() + "})";
  }

  public void startProcessing() {
  }

  /**
   * A simulation of a document validation.
   */
  public boolean isValid() {
    return docNumber > 0;
  }

  /*
   * A simple save method
   */
  public void save() throws IOException {
    File documentFile = new File("doc" + docType + ".bin");
    try (FileOutputStream fileOutputStream = new FileOutputStream(documentFile);
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
    ) {
      objectOutputStream.writeObject(this);
    } catch (IOException ioEx) {
      throw new RuntimeException("Error saving: " + ioEx.getMessage());
    }
  }

  /*
   * A simple load method
   */
  public static Document load(Integer id) throws IOException, ClassNotFoundException {
    File documentFile = new File("doc" + id + ".bin");
    Document founddocument = null;
    try (FileInputStream fileInputStream = new FileInputStream(documentFile);
         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
    ) {
      founddocument = (Document) objectInputStream.readObject();
    } catch (FileNotFoundException fileNotFoundEx) {
      throw new RuntimeException("File not found: " + fileNotFoundEx.getMessage());
    } catch (IOException ioEx) {
      throw new RuntimeException("Error loading: " + ioEx.getMessage());
    } catch (ClassNotFoundException classNotFoundEx) {
      throw new RuntimeException("Class not found: " + classNotFoundEx.getMessage());
    }
    return founddocument;
  }

  /**
   * A simulation of a document contentCheck.
   *
   * @param document
   */
  protected boolean contentCheck(Document document) {

    // In the current teaching context "pattern" a document contentCheck is only simulated.
    if (document.getDocTitle().trim().length() < 5) {
      //	LOGGER.info("document with number " + Simpledocument.docNumber + " has not a correct title.");
      return false;

    } else {
      //LOGGER.info("document with number " + Simpledocument.docNumber + " has a correct title.");
      return true;
    }
  }

  /**
   * A simulation of a document approval.
   *
   * @param document
   */
  protected void approve(Document document) {
    if (contentCheck(document)) {
      //LOGGER.info("document with number " + document.docNumber + " approved with regard to the correct content.");
    } else
      //LOGGER.info("document with number " + document.docNumber + " not approved with regard to the correct content.");
      LOGGER.info("document with number ");
  }

  /**
   * Returns the number of the document.
   *
   * @return docNumber
   */
  public int getDocNumber() {
    return docNumber;
  }

  /**
   * Sets the number of the document.
   *
   * @param docNumber
   */
  public void setDocNumber(int docNumber) {
    if (docNumber > 0)
      this.docNumber = docNumber;
  }

  /**
   * Returns the title of the document
   *
   * @return docTitle
   */
  public String getDocTitle() {
    return docTitle;
  }

  /**
   * Sets the title of the document
   *
   * @param docTitle
   */
  public void setDocTitle(String docTitle) {
    this.docTitle = docTitle;
  }

  /**
   * Returns the type of the document
   *
   * @return docType
   */
  public String getDocType() {
    return docType;
  }

  /**
   * Returns the approval status of the document.
   *
   * @return approvalStatus
   */
  public boolean getApprovalStatus() {
    return approvalStatus;
  }

  /**
   * Sets the the approval status of the document.
   *
   * @param approvalStatus
   */
  public void setApprovalStatus(boolean approvalStatus) {
    this.approvalStatus = approvalStatus;
  }
}
