
package data;

/*
 * "Customer" represents a customer of the book shop.
 */


import java.util.Enumeration;
import java.util.Vector;

public class Customer {
  private String name;
  private Vector<Rental> customerRentals = new Vector<Rental>();

  public Customer(String name) {
    this.setName(name);
  }

  public void addRental(Rental arg) {
    customerRentals.addElement(arg);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String createRentalInvoice() {
    Enumeration<Rental> rentals = customerRentals.elements();
    String result = "Rental record for " + getName() + "\n";
    while (rentals.hasMoreElements()) {
      Rental currentRental = (Rental) rentals.nextElement();
/* Output the book and costs of this rental */

      result += "\t" + currentRental.getBook().getTitle() + "\t" +
        String.valueOf(currentRental.calculateCharge()) + "\n";
    }

/* Insert the footer line */

    result += "Amount owed is " + String.valueOf(calculateTotalCharge()) + "." + "\n";
    result += "You earned " + String.valueOf(calculateTotalFrequentRenterPoints()) + " frequent renter points.";
    return result;
  }

  public String createRentalInvoiceHTML() {
    Enumeration<Rental> rentals = customerRentals.elements();
    String result = "<H1>Rental record for <EM>" + getName() + "</EM></H1>\n";
    while (rentals.hasMoreElements()) {
      Rental currentRental = (Rental) rentals.nextElement();
			
			*/
/* Output the book and costs of this rental */

      result += "\t" + currentRental.getBook().getTitle() + "\t" +
        String.valueOf(currentRental.calculateCharge()) + "<BR>\n";
    }
		
		*/
/* Insert the footer line */

    result += "<p>Amount owed is <EM>" + String.valueOf(calculateTotalCharge()) + "." + "\n";
    result += "You earned " + String.valueOf(calculateTotalFrequentRenterPoints()) + "</EM> frequent renter points.</p>";
    return result;
  }

  private double calculateTotalCharge() {
    double totalCharge = 0;
    Enumeration<Rental> rentals = customerRentals.elements();
    while (rentals.hasMoreElements()) {
      Rental currentRental = (Rental) rentals.nextElement();
      totalCharge += currentRental.calculateCharge();
    }
    return totalCharge;
  }

  private int calculateTotalFrequentRenterPoints() {
    int totalFrequentRenterPoints = 0;
    Enumeration<Rental> rentals = customerRentals.elements();
    while (rentals.hasMoreElements()) {
      Rental currentRental = (Rental) rentals.nextElement();
      totalFrequentRenterPoints += currentRental.getFequentRenterPoints();
    }
    return totalFrequentRenterPoints;
  }
}


