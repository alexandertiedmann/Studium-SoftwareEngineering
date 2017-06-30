package inheritance1;

public class RoutePlanning {
	private String customerName;
	
	public RoutePlanning () {
		this.setCustomerName(customerName);
	}
		
	public double getTotalMass(AVehicle vehicle){
		return vehicle.getTotalMass();
	}
	// A method in Car from Interface ICar
	public int getNumberCarDoors(Car car){
		return car.getNumberCarDoors();
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
