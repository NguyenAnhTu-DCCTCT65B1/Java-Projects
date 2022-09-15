package java_collection;

import java.util.LinkedHashSet;
import java.util.Iterator;

/*
 * 1. Collection
 * - La 1 root interface trong he thong cap bac collection
 * - Java collection cung cap nhieu interface ( Set, List, Queue, ... )
 *   va cac lop ( ArrayList, Vector, LinkedList, HashSet, TreeSet, ... )
 * 
 * 2. Collections
 * - La 1 khuon kho cung cap 1 kien truc de luu tru va thao tac toi nhom cac object
 * - Java collections thuc hien cac hoat dong search, insert, delete, ... 
 */

public class Basic {
    
	private String name;
	private int age;
	private String address;
	
	public Basic(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String toString() {
		return "Student: " + name + ", Age: " + age + ", Address: " + address;
	}
	
	public static void main(String[] args) {
        LinkedHashSet<Basic> a = new LinkedHashSet<Basic>();
        Basic b1 = new Basic("Tuan", 19, "Ha Noi");
        Basic b2 = new Basic("Thanh", 20, "TP.HCM");
        Basic b3 = new Basic("Hieu", 21, "Hai Phong");
        a.add(b1);
        a.add(b2);
        a.add(b3);
        Iterator<Basic> i = a.iterator();
        Basic b;
        while (i.hasNext()) {
        	b = i.next();
        	System.out.println(b.toString());
        }
	}
}