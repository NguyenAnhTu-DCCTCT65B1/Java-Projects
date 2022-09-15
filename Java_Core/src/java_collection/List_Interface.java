package java_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * 1. List
 * - La 1 interface trong java
 * - Chua cac method de insert va delete cac phan tu dua vao chi so index
 * - Co cac phan tu trung nhau, co the chua nhieu phan tu null
 * 
 * NOTE: ListIterator la 1 interface duoc su dung de duyet cac phan tu cua list 
 * 
 * 2. ArrayList
 * - La 1 lop ke thua tu lop AbstractList va trien khai cua List
 * - Su dung nhu 1 mang dong de luu tru cac phan tu
 * 
 * DUNG ARRAYLIST VI: Toc do truy xuat ngau nhien nhanh => Tiet kiem bo nho
 * 
 * NOTE:
 * - Co the chua cac phan tu trung lap
 * - Duy tri thu tu cua cac phan tu duoc them vao
 * - Khong dong bo
 * - Cho phep truy cap ngau nhien vi no luu data theo index
 * - Thao tac cham vi can nhieu su dich chuyen neu bat ki phan tu nao bi xoa khoi list
 * 
 * DUNG ARRAYLIST KHI muon truy cap vao phan tu
 * 
 * 3. LinkedList
 * - Lop LinkedList la 1 lop extends lop AbstractSequentialList va implement tu List va Queue interface
 * - Su dung cau truc Double Linked List de luu tru cac phan tu
 * 
 * DUNG LINKEDLIST VI: Kich thuoc linh hoat, de dang them va xoa phan tu
 * 
 * NOTE: 
 * - Co the chua cac phan tu trung lap
 * - Duy tri thu tu cua phan tu duoc them vao
 * - Khong dong bo
 * - Thao tac nhanh vi khong can phai dich chuyen neu bat ki phan tu nao bi xoa khoi list
 * - Co the duoc su dung nhu list, stack or queue
 * 
 * DUNG LINKEDLIST KHI muon them, sua or xoa cac phan tu
 * 
 * 4. Tong ket
 * a. Giong nhau
 * - Deu duoc implement tu List interface
 * - Deu Duy tri thu tu cua phan tu duoc them vao
 * - Deu khong dong bo
 * 
 * b. Khac nhau
 *                   ArrayList                           |                        LinkedList
 * - ArrayList su dung mang dong de luu tru cac phan tu  | - LinkedList su dung Double linked list de luu tru cac phan tu
 * - Thao tac cham vi can phai dich chuyen phan tu       | - LinkedList nhanh hon vi khong can phai dich chuyen phan tu
 * - Hoat dong nhu 1 list                                | - Hoat dong nhu 1 list va queue
 * - Tot hon trong viec luu tru va truy cap data         | - LinkedList tot hon trong viec thao tac data
 */

public class List_Interface {
    public void List() {
    	System.out.println("LIST:");
	    List<String> l = new ArrayList<String>();
	    l.add("Java");
	    l.add("PHP");
	    l.add("C++");
	    l.add("Python");
	    l.add(2, "C");
	    
	    ListIterator<String> li = l.listIterator();
     	System.out.println("Duyet cac phan tu tu dau den cuoi: ");
	    while (li.hasNext()) {
		    System.out.print(li.next() + " ");
	    }
	
	    System.out.println("\n\nDuyet cac phan tu tu cuoi ve dau: ");
	    while (li.hasPrevious()) {
		    System.out.print(li.previous() + " " );
	    }
    }
    
    public void ArrayList() {
    	System.out.println("\n\nARRAYLIST:");
    	ArrayList<Integer> a = new ArrayList<Integer>();
    	Object b = new ArrayList<Integer>();
    	a.add(11);
    	a.add(22);
    	a.add(33);
    	a.add(44);
    	a.add(55);
    	
    	System.out.println("\nFOREACH:");
    	a.forEach(i -> System.out.println(i));
    	for(Integer i : a) {
    		System.out.println(i * 2);
    	}
    	
    	System.out.println("\nSau khi clone:");
    	b = a.clone();
    	a.add(66);
    	System.out.println(b);
    	
    	System.out.println("\nCac phan co trong list la: ");
    	System.out.println(a);
    	
    	a.remove(2);
    	System.out.print("Mang sau khi xoa phan tu:\n");
    	for (int i = 0; i < a.size(); i++) {
    		System.out.print(a.get(i) + " ");
    	}
    	
    	// Check xem 11 co trong list hay khong ?
    	System.out.println("\nCo phan tu trong list ? " + a.contains(11));
    }
    
    public void LinkedList() {
    	System.out.println("\nLINKEDLIST:");
    	LinkedList<Character> ll = new LinkedList<Character>();
    	ll.add('a');
    	ll.add('b');
    	ll.add('c');
    	ll.add('d');
    	System.out.println("Cac phan co trong list la:");
    	for (Character ch : ll) {
    		System.out.print(ch + " ");
    	}
    	
    	System.out.println("\nCap nhat list:");
    	ll.set(2, 'e');
    	System.out.println(ll);
    }
    
	public static void main(String[] args) {
		List_Interface l = new List_Interface();
		l.List();
		l.ArrayList();
		l.LinkedList();
	}
}