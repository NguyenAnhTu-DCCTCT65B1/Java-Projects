package oop;

/*
 * 1. this: con tro cua lop, tro den doi tuong cua lop
 * 2. super: thua ke lai ham tao cua lop cha. NOTE: ham phai duoc khoi tao dau tien trong ham tao cua lop con
 * 3. Dynamic method dispatch
 * - Day la 1 co che duoc goi khi phuong thuc duoc ghi de, ap dung trong run time - khi chay thi no duoc goi
 * => Hay con duoc goi la co che da hinh duoc xu li trong java
 * VD: Sup s = new Child()
 *     -> s: ref to obj
 *     -> new Child() : obj
 * => Dieu do nghia la ref s chi co the truy cap phuong thuc cua Sup - lop cha va nhung phuong thuc da duoc ghi trong lop con
 * 
 * Access modifier table:
 * ===================================================================
 * Area           			| default | private | protected | public |
 * ------------------------------------------------------------------
 * same class     			|    o    |    o    |     o     |   o    |
 * ------------------------------------------------------------------
 * same package-sub class	|    o    |    x    |     o     |   o    |
 * ------------------------------------------------------------------
 * same package-nonsub class|    o    |    x    |     o     |   o    |
 * ------------------------------------------------------------------
 * diff package-sub class   |    x    |    x    |     o     |   o    |
 * ------------------------------------------------------------------
 * diff package-nonsub class|    x    |    x    |     x     |   o    |
 * ===================================================================
*/

class Base {
	private int project_1;
	private String project_2;
	
	public int getProject_1() {
		return this.project_1;
	}
	
	public String getProject_2() {
		return this.project_2;
	}
	
	public Base(int a, String b) {
		System.out.println("Ham tao cua Base Class:");
		this.project_1 = a;
		this.project_2 = b;
	}
	
	public void method_1() {
		System.out.println("Method 1");
	}
}

class Child extends Base {
	String name;
	public Child(int a, String b, String name) {
		super(a, b);
		this.name = name;
		System.out.println("Ham tao cua Child Class:");
	}
	
	@Override
	public void method_1() {
		System.out.println("Override Method 1");
	}
	
	public void method_2() {
		System.out.println("Override method 1");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		
		// Base b = new Base(15, "A");
	    // System.out.println(b.getProject_1() + " " + b.getProject_2());
		
		// Child c = new Child(10, "TEST", "Child");
		// System.out.println(b.getProject_1() + " " + b.getProject_2() + " " + c.name);
		
		Base b = new Child(10, "A", "Child");
		b.method_1();	
	}
}