package inheritance1;

public class MotorBicycle extends Bicycle {
	
	private double monthlyCosts;
	
	
	@Override
	public double getMaxVelocity(double totalMass) {
		// Only a dummy return. Not important for our context.
		return totalMass +3;
	}

	public double getMonthlyCosts() {
		return monthlyCosts;
	}

	public void setMonthlyCosts(int monthlyCosts) {
		this.monthlyCosts = monthlyCosts;
	}

}
