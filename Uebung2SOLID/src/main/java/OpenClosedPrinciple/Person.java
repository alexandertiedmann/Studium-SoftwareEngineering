package OpenClosedPrinciple;

import java.io.IOException;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.05.2017
 */
public class Person {
  private String name;
  private Storage storage;

  public Person() { }

  public Person(String name, Storage store){
    this.name = name;
    this.storage = store;
  }

  public String save() throws IOException{
    return storage.save(name);
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setStorage(Storage typ){
    this.storage = typ;
  }

}
