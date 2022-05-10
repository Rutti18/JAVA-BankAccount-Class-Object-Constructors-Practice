
public class Product {

	private String productName;
	private int quantity;
	private double productCost;
	
	//constructor to initialize variables
	public Product(String productName, int qty, double prodCost) {
		this.productCost = prodCost;
		this.quantity = qty;
		this.productName = productName;
	}
	
	private void printProductDetails() {
		System.out.println(productName+" costs "+productCost+" and "+ quantity+ " units were purchased");
	}
	
	//product cost
	private void totalCost() {
		System.out.println("Total cost is:"+ quantity*productCost);
	}
	
	public static void main(String[] args) {
		Product product = new Product("Hershey's Milk Chocolate" , 10, 5 );
		product.printProductDetails();
		product.totalCost();
	}
}
