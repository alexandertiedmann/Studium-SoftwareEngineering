package SingleResponsibilityPrinciple.loesung;

import java.io.*;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.05.2017
 */
public class SerializablePersister<T> {
  public void save(T obj, String type, int i) throws RuntimeException {
    File documentFile = new File(type + i + ".bin");
    try (FileOutputStream fileOutputStream = new FileOutputStream(documentFile);
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
    ) {
      objectOutputStream.writeObject(obj);
    } catch (IOException ioEx) {
      throw new RuntimeException("Error saving: " + ioEx.getMessage());
    }
  }

  public T load(String type, Integer docNumber) {
    File documentFile = new File(type + docNumber + ".bin");
    T founddocument = null;
    try (FileInputStream fileInputStream = new FileInputStream(documentFile);
         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
    ) {
      founddocument = (T) objectInputStream.readObject();
    } catch (FileNotFoundException fileNotFoundEx) {
      throw new RuntimeException("File not found: " + fileNotFoundEx.getMessage());
    } catch (IOException ioEx) {
      throw new RuntimeException("Error loading: " + ioEx.getMessage());
    } catch (ClassNotFoundException classNotFoundEx) {
      throw new RuntimeException("Class not found: " + classNotFoundEx.getMessage());
    }
    return founddocument;
  }
}
