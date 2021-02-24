package services;

public class BrazilInterestService implements InterestService{

	private double interetRate;

	public BrazilInterestService(double interetRate) {		
		this.interetRate = interetRate;
	}
	
	@Override
	public double getInterestRate() {
		return interetRate;
	}
}
