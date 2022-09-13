package model;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Sep 13, 2022
 */
public class CrossfitTotalCalculator {

	private double deadlift;
	private double backSquat;
	private double strictPress;
	
	private double total;
	
	public CrossfitTotalCalculator() {
		super();
	}
	
	public CrossfitTotalCalculator(double deadlift, double backSquat, double strictPress) {
		super();
		this.deadlift = deadlift;
		this.backSquat = backSquat;
		this.strictPress = strictPress;
		setTotal(deadlift, backSquat, strictPress);
	}

	//getters and setters
	public double getDeadlift() {
		return deadlift;
	}

	public void setDeadlift(double deadlift) {
		this.deadlift = deadlift;
	}

	public double getBackSquat() {
		return backSquat;
	}

	public void setBackSquat(double backSquat) {
		this.backSquat = backSquat;
	}

	public double getStrictPress() {
		return strictPress;
	}

	public void setStrictPress(double strictPress) {
		this.strictPress = strictPress;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	//method to calculate total 
	public void setTotal(double deadlift, double backSquat, double strictPress) {
		double crossfitTotal = (deadlift + backSquat + strictPress);
		setTotal(Math.round(crossfitTotal * 10) / 10.0);
	}

	@Override
	public String toString() {
		return "CrossfitTotalCalculator [deadlift=" + deadlift + ", backSquat=" + backSquat + ", strictPress="
				+ strictPress + ", total=" + total + "]";
	}
	
	
		
	
}
