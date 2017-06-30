package data;/*
 * Book is a simple data class
 */


public class BookInitial {

  private String title;
  private PriceCode priceCode;

  public BookInitial(String title, PriceCode priceCode) {
    this.title = title;
    this.priceCode = priceCode;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PriceCode getPriceCode() {
    return priceCode;
  }

  public void setPriceCode(PriceCode arg) {
    this.priceCode = arg;
  }
}
