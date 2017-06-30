package inheritance1;

public class UpperClassCar extends Car  {
	
	private int numberSeatings = 4;
	private double torque;
	
	public UpperClassCar() {		
	}
	public double calculateTorque() {		
		return super.calculateTorque() + torque + 100;
	}
	
	public int getNumberSeatings() {
		return numberSeatings;
	}

	public void setNumberSeatings(int numberSeatings) {
		this.numberSeatings = numberSeatings;
	}
	public double getTorque() {
		return torque;
	}
}
