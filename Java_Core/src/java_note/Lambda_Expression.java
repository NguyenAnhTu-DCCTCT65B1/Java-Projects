package java_note;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 1. Functional Interface
 * - La 1 interface chi chua 1 abstract method
 * - Dung Functional Interface vi no la 1 ung dung quan trong cua Lambda Expression de tao ra instance cho interface do
 * 
 * 2. Lambda Expression
 * - La 1 ham an danh => cung co day du cac tham so va body
 * - Tham so co the co or khong, body cung co the co gia tri tra ve or khong
 * - Dua tren tham so dau vao va xu li lenh trong body de dua ra ket qua
 * => Huu ich trong Collection
 * - Dung Lambda Expression vi no giup giam so dong code
 */

@FunctionalInterface
interface Person {
	void run();
}

class Product {
    int id;
    String name;
    int price;
 
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Lambda_Expression {
    
	public static void main(String[] args) {
		int b = 100;
		Person ps = () -> {
			System.out.println("Running: " + b + " km");
		};
		ps.run();
		
		List<Product> list = new ArrayList<Product>();
		 
        list.add(new Product(1, "Dell Laptop", 25000));
        list.add(new Product(3, "Keyboar", 300));
        list.add(new Product(2, "Asus Laptop", 150));
 
        System.out.println("Sap xep cac san pham theo ten: ");
 
        Collections.sort(list, (p1, p2) -> {   	
         	return p1.name.compareTo(p2.name);
        });
        
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
	}
}