package OpenClosedPrinciple;

import java.io.IOException;

public class FileStorage extends Storage{

  public FileStorage(String s) {
  }

  public FileStorage() {
  }

  public String save(String s) throws IOException {
    s = s + " saved in a file.";
    return s;
  }
}
