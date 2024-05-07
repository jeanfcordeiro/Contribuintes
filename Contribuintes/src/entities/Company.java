package entities;

public class Company extends TaxPayer {

	private int numberOfEmployees;
	
	public Company() {
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	double impost = 0.0;
	@Override
	public double tax() {
		if (numberOfEmployees < 10) {
			impost = getAnualIncome() * 0.16;
		} 
		else {
			impost = getAnualIncome() * 0.14;
		}
		return impost;
	}
	
	
	
}
