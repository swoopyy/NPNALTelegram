package npnets.simulator.simulate;

public class TimeBound {
	private double lower;
	private double upper;
	public TimeBound(double lower, double upper)
	{
		this.lower=lower;
		this.upper=upper;
	}
	public double getLower() {
		return lower;
	}
	public void setLower(double lower) {
		this.lower = lower;
	}
	public double getUpper() {
		return upper;
	}
	public void setUpper(double upper) {
		this.upper = upper;
	}
   
}
