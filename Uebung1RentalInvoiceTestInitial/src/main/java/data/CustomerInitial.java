package data;
/*
 * "Customer" represents a customer of the book shop.
 */

import java.util.Enumeration;
import java.util.Vector;

import static data.PriceCode.NEW_RELEASE;

public class CustomerInitial {
  private String name;
  private Vector<RentalInitial> customerRentals = new Vector<RentalInitial>();

  public CustomerInitial(String name) {
    this.setName(name);
  }

  ;
  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * A possible case: a customer object must not exist without a rental object.
	 * Multiplicity = 1 ... * at the class symbol 'Rental' in the class diagram.
	 */
	/*
	public Customer (String name, Rental rental) {
		this.setName(name);
		this.customerRentals.add(rental);
	};
	*/
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

  public void addRental(RentalInitial rental) {
    customerRentals.addElement(rental);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String statement() {
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    Enumeration<RentalInitial> rentals = customerRentals.elements();
    //customerRentals.iterator().hasNext();
    String result = "Rental record for " + getName() + "\n";
    while (rentals.hasMoreElements()) {
      double currentAmount = 0;
      RentalInitial rental = (RentalInitial) rentals.nextElement();

      currentAmount = rental.calculateCharge();
			
			/* Sum of bonus points */
      frequentRenterPoints++;
			/* Bonus points for a two day-rental of a new release */
      if ((rental.getBook().getPriceCode() == NEW_RELEASE) &&
        rental.getDaysRented() > 1)
        frequentRenterPoints++;
			
			/* Output the numbers of this rental */
      result += "\t" + rental.getBook().getTitle() + "\t" +
        String.valueOf(currentAmount) + "\n";
      totalAmount += currentAmount;
    }
		
		/* Insert the footer line */
    result += "Amount owed is " + String.valueOf(totalAmount) + "." + "\n";
    result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points.";
    return result;
  }
}
