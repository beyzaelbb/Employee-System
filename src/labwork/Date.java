package labwork;

import java.util.Scanner;

public class Date {
	
	int day;
	int month;
	int year;
	int hour;
	int minute;
	
	public Date() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter day: ");
		day = scanner.nextInt();
		scanner.nextLine();
		
		
		System.out.println("Enter month: ");
		month = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter year: ");
		year = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter hour: ");
		hour = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter minute: ");
		minute = scanner.nextInt();
		scanner.nextLine();
		
		
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return day + "/" + month + "/" + year + " "  + hour + ":" + minute;
	}
	
}