package entities;

public class Individual extends TaxPayer {

	private Double heathExpenditures;
	
	public Individual() {
	}

	public Individual(String name, Double anualIncome, Double heathExpenditures) {
		super(name, anualIncome);
		this.heathExpenditures = heathExpenditures;
	}

	public Double getHeathExpenditures() {
		return heathExpenditures;
	}

	public void setHeathExpenditures(Double heathExpenditures) {
		this.heathExpenditures = heathExpenditures;
	}

	
	@Override	
	public double tax() {
		double impost;
		if (getAnualIncome() < 20000.00) {
			impost = getAnualIncome() * 0.15;
		} 
		else {
			impost = getAnualIncome() * 0.25;
		}
		if (heathExpenditures>0) {
			impost -=(heathExpenditures * 0.5);
		}
		return impost;
	}
	
	
}
