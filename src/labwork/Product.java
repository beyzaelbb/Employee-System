package labwork;

import java.util.Scanner;

public class Product implements Payable {
	
	private int id;
	private String brand;
	private String model;
	private boolean free_shipping;
	private int stock;
	private String category;
	private static int productCount = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	public Product() {
		productCount++;
		
		System.out.println("Enter ID: ");
		id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter brand: ");
		brand = scanner.nextLine();
		
		System.out.println("Enter model: ");
		model = scanner.nextLine();
		
		System.out.println("Enter shipping status: ");
		free_shipping = scanner.nextBoolean();
		scanner.nextLine();
		
		System.out.println("Enter stock: ");
		stock = scanner.nextInt();
		scanner.nextLine();
	}
	
	
	public Product(String category) {
		this();

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isFree_shipping() {
		return free_shipping;
	}

	public void setFree_shipping(boolean free_shipping) {
		this.free_shipping = free_shipping;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public static int getProductCount() {
		return productCount;
	}

	public static void setProductCount(int productCount) {
		Product.productCount = productCount;
	}

	public void displayProduct() {
		System.out.println("id: " + this.id);
		System.out.println("brand: " + this.brand);
		System.out.println("model: " + this.model);
		System.out.println("is free shipping available: " + this.free_shipping);
		System.out.println("stock: " + this.stock);
		if(category != null ) {
			System.out.println("category: " + this.category);
		}
		
	}
	
	public void DisplayNumProducts() {
		System.out.println("number of products so far is " + productCount);
	}


	@Override
	public double calculatePayment() {
		if(this.isFree_shipping() == false) {
			return 10.0 + 50.0;
		}
		else return 50.0;
	}
	
	

}
