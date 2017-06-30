package OpenClosedPrinciple;

import java.io.IOException;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.05.2017
 */
public class Storage {

  public Storage(StorageType s) {}

  public Storage() { }

  public String save(String s) throws IOException {
    return this.save(s);
  }

  public Storage createStorage(StorageType storage){
    switch (storage) {
      /**case DB:
       return new DBStorage;
       break;**/
      case FILE:
        return new FileStorage();
      case XML:
        return new XMLStorage();
      default:
        return new FileStorage();
    }
  }
}
