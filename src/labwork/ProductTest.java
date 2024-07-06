package labwork;


import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ProductTest {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Product> product_list = new ArrayList<Product>();
		ArrayList<Employee> employee_list = new ArrayList<Employee>();
		
		ArrayList<Payable> data_list =  new ArrayList<Payable>();
		
		int temp_id;
		int emp_id;
		boolean flag = false;
		boolean flag2 = false;
		
		int num2 = 555;
		int selection;
		
		while(num2 != 0) {
			
			System.out.println("1. Create a new Product");
			System.out.println("2. Create a new Product with category ");
			System.out.println("3. Create a new Employee");
			System.out.println("4. Create a new Employee with department ");
			System.out.println("5. Display Product information ");
			System.out.println("6. Display Employee information ");
			System.out.println("7. Display number of Products ");
			System.out.println("8. Calculate total payment");
			System.out.println("0. Exit");
			
			num2 = scanner.nextInt();
			scanner.nextLine();
			
			switch(num2) {
			case 1:
				data_list.add(new Product());
				break;
			case 2:
				// Create a new Product with Category
				String tem_cat;
				scanner.nextLine(); //?
				System.out.println("Enter Category");
				tem_cat = scanner.nextLine();
				data_list.add(new Product(tem_cat));
				
				break;
			case 3:
				System.out.println("1. Create a new Full Time Employee");
				System.out.println("2. Create a new Hourly Employee ");
				selection = scanner.nextInt();
				if(selection == 1) {
					data_list.add(new FullTimeEmployee());
				}
				else if(selection == 2) {
					data_list.add(new HourlyEmployee());
				}
				
				break;
			
			case 4:
				System.out.println("1. Create a new Full Time Employee");
				System.out.println("2. Create a new Hourly Employee ");
				int select = scanner.nextInt();
				scanner.nextLine();
				
				String temp_dep;
				System.out.println("Enter department: ");
				temp_dep = scanner.nextLine();
				if(select == 1) {
					data_list.add(new FullTimeEmployee(temp_dep));
				}
				else if(select == 2) {
					data_list.add(new HourlyEmployee(temp_dep));
				}
				
				break;
				
				
			case 5:
				Iterator<Payable> data_it = data_list.iterator();
		
				System.out.println("Enter Product id: ");
				temp_id = scanner.nextInt();
				scanner.nextLine();
				
				while(data_it.hasNext()) {
					Payable p = data_it.next();
					if(p instanceof Product) {
						Product P = ((Product)p);
						if(P.getId() == temp_id) {
							flag = true;
							P.displayProduct();
							break;
						}
					}
				}
				
				if(flag == false) {
					System.out.println("id not found");
				}

				break;
				
			case 6:
				ArrayList<Employee> SortedEmp = new ArrayList<Employee>();
				ArrayList<Employee> sortedEmp2 = new ArrayList<Employee>();
				
				for(Payable p : data_list) {
					if(p instanceof Employee) {
						SortedEmp.add((Employee) p);
						sortedEmp2.add((Employee) p);
					}
				}
				
				System.out.println("1. Sorted by id");
				System.out.println("2. Sorted by name");
				int chc = scanner.nextInt();
				
				if(chc == 1) {
					Collections.sort(SortedEmp);
					for(Employee e : SortedEmp) {
						e.displayEmployee();
					}
				}
				
				else {
					NameComparator nc = new NameComparator();
					Collections.sort(sortedEmp2, nc);
					for(Employee e : SortedEmp) {
						e.displayEmployee();
					}				
				}

				break;
				
			case 7: 
				System.out.println("number of products: " + Product.getProductCount());
				break;
				
			case 8:
				double total = 0;
				for(Payable p : data_list) {
					total += p.calculatePayment();
				}
				
				System.out.println(total);
				break;
				
			case 0:
				break;
			}
			
		}
		
	
		
	}

}
