package labwork;

import java.util.Scanner;

public abstract class Employee implements Payable, Comparable<Employee>{
	private int id;
	private String name;
	private String department;
	private Date startDate;
	private static int counter = 0;
	double insuranceRate;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Employee.counter = counter;
	}

	public Employee(String dep) {
		
		counter++;
		Scanner scanner = new Scanner(System.in);
		
		department = dep;
		
		System.out.println("Enter id: ");
		id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter name: ");
		String n = scanner.nextLine();
		this.name = n;
		
		startDate = new Date();
		
		if(this.getDepartment().equalsIgnoreCase("Tech")) {
			insuranceRate = 0.2;
		}
		else if(this.getDepartment().equalsIgnoreCase("Finance")) {
			insuranceRate = 0.1;
		}
		else {
			insuranceRate = 0.05;
		}
		
	}
	
	public Employee() {
		counter++;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter name: ");
		String n = scanner.nextLine();
		this.name = n;
		
		startDate = new Date();
		
		department = "Tech";
		
		insuranceRate = 0.2;
		
	}
	
	public void displayEmployee() {
		System.out.println("id: " + id);
		System.out.println("Name: " + name);
		if(department != null) {
			System.out.println("Department: " + department);
		}
		
	}

	@Override
	public int compareTo(Employee o1) {
		
		return this.id - o1.id;
	}
	

}


