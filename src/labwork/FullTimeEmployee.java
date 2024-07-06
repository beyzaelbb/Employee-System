package labwork;

import java.util.Scanner;

public class FullTimeEmployee extends Employee implements Payable{
	double salery;
	
	public FullTimeEmployee() {
		super();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter salery: ");
		salery = scanner.nextDouble();
		
	}
	
	public FullTimeEmployee(String dep) {
		super(dep);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter salery: ");
		salery = scanner.nextDouble();
		
	}

	@Override
	public void displayEmployee() {
		// TODO Auto-generated method stub
		super.displayEmployee();
		System.out.println("salery: " + calculatePayment());
		System.out.println("start date: " + getStartDate().toString());
	}

	@Override
	public double calculatePayment() {
		return salery + (insuranceRate * salery);
	}

	
	
}

 