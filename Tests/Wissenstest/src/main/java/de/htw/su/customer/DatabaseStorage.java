package de.htw.su.customer;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.05.2017
 */
public class DatabaseStorage extends AStorage {


  @Override
  public String save(String s) {

    return s + " saved in a data base.";
  }
}
