package inheritance1;

public class Truck extends AVehicle {
	
	private int numberAxis;
	private double axisThrusload;
	
	public Truck() {}
	
	@Override
	public double getMaxVelocity(double totalMass) {
		// Only a dummy return. Not important for our context.
		return super.getMaxVelocity(totalMass);
	}

	public int getNumberAxis() {
		return numberAxis;
	}

	public void setNumberAxis(int numberAxis) {
		this.numberAxis = numberAxis;
	}

	public double getAxisThrusload() {
		return axisThrusload;
	}

	public void setAxisThrusload(double axisThrusload) {
		this.axisThrusload = axisThrusload;
	}

}
