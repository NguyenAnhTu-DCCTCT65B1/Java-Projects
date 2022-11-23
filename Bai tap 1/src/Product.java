
import java.util.Scanner;

/*
  
*/

public class Product {
	Scanner s = new Scanner(System.in);
	private String name;
	private int price;
	
	public void setProduct() {
		System.out.print("Thong tin san pham:\n");
		System.out.print("Ten san pham: ");
		name = s.nextLine();
		System.out.print("Don gia: ");
		price = s.nextInt();
	}
	
	public double getImportTax() {
		return price * 10 / 100;
	}
	
	public void getProduct() {
		System.out.print("Ten SP: " + name + "\t" + "Don gia: " + price);
	}

	public static void main(String[] args) {
		Product p = new Product();
		p.setProduct();
		p.getProduct();
		System.out.print("\nThue la: " + p.getImportTax());

	}

}
