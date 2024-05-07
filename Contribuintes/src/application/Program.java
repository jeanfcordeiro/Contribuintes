package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.print("Enter the number of taxpayers:");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.println("Health expenditures: ");
				double heathExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, heathExpenditures));
			}
			else {
				System.out.println("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		for(TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName()+ ": $" + String.format("%.2f", taxPayer.tax()));
		}
		
		double total =0.0;
		for(TaxPayer taxpayer : list) {
			total += taxpayer.tax();
		}
		System.out.println("TOTAL TAXES: $" + String.format("%2f", total));
		sc.close();
		
	}

}
