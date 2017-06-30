package data;/*
 * "Rental" represents a rental of a book by a customer.
 */

public class RentalInitial {
  private BookInitial book;
  private int daysRented;

  public RentalInitial(BookInitial bookInitial, int daysRented) {
    this.book = bookInitial;
    this.daysRented = daysRented;
  }

  public BookInitial getBook() {
    return book;
  }

  public int getDaysRented() {
    return daysRented;
  }

  public double calculateCharge(){
    double currentAmount = 0;
    /* Calculate amounts per rental */
    switch (this.getBook().getPriceCode()) {
      case REGULAR:
        currentAmount += 2;
        if (this.getDaysRented() > 2)
          currentAmount += (this.getDaysRented() - 2) * 1.5;
        break;
      case CHILDREN:
        currentAmount += 1.5;
        if (this.getDaysRented() > 3)
          currentAmount += (this.getDaysRented() - 3) * 1.5;
        break;
      case NEW_RELEASE:
        currentAmount += this.getDaysRented() * 3;
        break;
    }
    return currentAmount;
  }
}
