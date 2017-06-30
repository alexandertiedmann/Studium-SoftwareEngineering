package de.htw.su.customer;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.05.2017
 */
public class StorageService implements IStorageService {
  StorageType storageType;

  public StorageService(StorageType store) {
    storageType = store;
  }

  @Override
  public AStorage createStorage(StorageType storageType) { //vorher public Storage ... (Storage existiert nicht)

    switch (storageType) {
      case XML:
        return new XmlStorage();
      case DB:
        return new DatabaseStorage();
      default:
        return null;
    }
  }

  public StorageType getStorageType(){
    return this.storageType;
  }
}
