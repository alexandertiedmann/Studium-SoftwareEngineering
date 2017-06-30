package de.htw.su.customer;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.05.2017
 */
public class Customer {
  private String name;

  public Customer() {
    this.setName(name);
  }

  public String saveIndependent(StorageService storageService, String s) {
    StorageType storageType = storageService.getStorageType();
    return storageService.createStorage(storageType).save(s);
  }

  public String print(String s) {
    //Print existiert nicht
    //Print print = new Print(s);
    //return print.print(s);
    return s;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
