import java.util.Scanner;

public class Commodity {
	
	Scanner scanner = new Scanner(System.in);
	private Product head;
	private int number;
	
	public Commodity() {
		head = null;
		number = 0;
	}
	
	public void insertProduct() {
		
		System.out.print("Nhap so luong san pham: ");
		number = scanner.nextInt();
		Product tail = head;
		int stt = 0;
		for (int i = 0; i < number; i++) {
			stt = i + 1;
			Product p = new Product();
			System.out.print("\nThong tin san pham thu " + stt);
			System.out.print("\nMa san pham: ");
			p.id = scanner.next();
			System.out.print("Ten san pham: ");
			scanner.nextLine();
			p.name = scanner.nextLine();
			System.out.print("Don vi: ");
			p.unit = scanner.next();
			System.out.print("Gia san pham: ");
			p.price = scanner.nextInt();
			System.out.print("So luong: ");
			p.amount = scanner.nextInt();
			// Them san pham moi vao vi tri dau tien cua ds
			//p.next = head;
			//head = p;
			// Them san pham moi vao vi tri cuoi cung cua ds
			if (head == null) {
				head = p;
				tail = head;
			}
			else {
				tail.next = p;
				tail = p;
			}
		}
	}
	
	public int RemoveProduct(int pos) {
		if (pos - 1 == 0) {
			Product p = head;
			head = p.next;
			p = null;
			return pos;
		}
		Product p = head;
		Product q = head;
		for (int i = 0; i < pos - 1; i++) {
			q = p;
			p = p.next;
		}
		q.next = p.next;
		p = null;
		return pos;
	}

	public void display() {
		Product p;
		p = head;
		System.out.print("Ma SP" + "\t\t");
		System.out.print("Ten SP" + "\t\t");
		System.out.print("Don vi" + "\t\t");
		System.out.print("Gia SP" + "\t\t");
		System.out.print("So luong\n");
		while (p != null) {
			System.out.print(p.id + "\t\t");
			System.out.print(p.name + "\t\t");
			System.out.print(p.unit + "\t\t");
			System.out.print(p.price + "\t\t");
			System.out.print(p.amount + "\n");
			p = p.next;
		}
	}
	
	public void ProductPriceCheck(int price) {
		Product p = head;
		int count = 0;
		while (p != null) {
			if (p.price > price) {
				count++;
			}
			p = p.next;
		}
		if (count > 0) {
			System.out.println("\nTim thay " + count + " san pham co gia lon hon " + price + " VNÐ");
		}
		else {
			System.out.println("\nKhong co san pham noa co gia lon hon 100000 VNÐ");
		}
	}
	
	void Swap(Product p1, Product p2) {
		Product temp = new Product();
		temp.id = p1.id; p1.id = p2.id; p2.id = temp.id;
		temp.name = p1.name; p1.name = p2.name; p2.name = temp.name;
		temp.unit = p1.unit; p1.unit = p2.unit; p2.unit = temp.unit;
		temp.price = p1.price; p1.price = p2.price; p2.price = temp.price;
		temp.amount = p1.amount; p1.amount = p2.amount; p2.amount = temp.amount;
	}
	
	public void Arrange() {
		Product p;
		Product q;
		p = head;
		while (p != null) {
			q = p.next;
			while (q != null) {
			    if (q.amount > p.amount) {
				    Swap(q, p);
			    }
			    q = q.next;
			}
			p = p.next;
		}
	}
	
	public static void main(String[] args) {
		Commodity sp = new Commodity();
		sp.insertProduct();
		System.out.println("\nDanh sach san pham sau khi nhap:");
		sp.display();
		sp.ProductPriceCheck(100000);
		sp.Arrange();
		System.out.println("\nSan pham sau khi sap xep theo so luong giam dan la:");
		sp.display();
		System.out.println("\nDanh sach san pham sau khi xoa: " + sp.RemoveProduct(1));
		sp.display();
	}
}