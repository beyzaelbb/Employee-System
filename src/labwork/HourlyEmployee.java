package labwork;

import java.util.Scanner;

public class HourlyEmployee extends Employee implements Payable{
	int workhour;
	double payment;
	
	public HourlyEmployee() {
		super();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter work hour: ");
		workhour = scanner.nextInt();
		
		System.out.println("Enter payment: ");
		payment = scanner.nextDouble();
	}
	
	public HourlyEmployee(String dep) {
		super(dep);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter work hour: ");
		workhour = scanner.nextInt();
		
		System.out.println("Enter payment: ");
		payment = scanner.nextDouble();
	}
	

	@Override
	public void displayEmployee() {
		// TODO Auto-generated method stub
		super.displayEmployee();
		System.out.println("workhour: " + workhour);
		System.out.println("payment: " + calculatePayment());
		System.out.println("start date: " + getStartDate().toString());
	}
	
	
	public double calculateDailyPayment(int workhour, double payment) {
		return workhour * payment;
	}

	@Override
	public double calculatePayment() {
		return payment + (insuranceRate * payment);
	}
	
	
	
}
