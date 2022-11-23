
public class Product {
	String id;
	String name;
	String unit;
	int price;
	int amount;
	Product next;
	Product() {
		this.id = " ";
		this.name = " ";
		this.unit = " ";
		this.price = 0;
		this.amount = 0;
		next = null;
	}
}
