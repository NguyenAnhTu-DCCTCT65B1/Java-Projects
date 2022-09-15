package oop;

/*
 * 1. Abstract class	
 - Abstract class co phuong thuc abstract (khong co than ham) va phuong thuc non-abstract (co than ham).	
 - Abstract class khong ho tro da ke thua.
 - Abstract class co cac bien final, non-final, static and non-static.	
 - Abstract class co the cung cap noi dung cai dat cho phuong thuc cua interface.
 
 CHU Y KHI DUNG ABSTRACT KEYWORD:
 - Abstract ko cho phep tao obj nhung co the cho phep ref.
 - Khong the ket hop static voi abstract vi static thuoc ve lop, no ko phai la the hien cua lop.
 - Vi lop ke thua phai ghi de phuong thuc abstract cua lop cha nen khong the ket hop final va abstract.	Vi final khong cho ghi de.
 VD:
 public abstract class Shape {
 public abstract void draw();
 }

 * 2. Interface
 - Interface chi co phuong thuc abstract. No co them cac phuong thuc default va static.
 - Interface chi co cac bien static va final.
 - Interface khong the cung cap noi dung cai dat cho phuong thuc cua abstract class.
 CHU Y:
 - Interface khong cho implements tu interface khac.
 VD:
 public interface Drawble {
 void draw();
 }
 - Interface dung khi chi co tinh chat da hinh.
*/
 

// static methods in interface
interface V {
	static void p() {
		System.out.println("1234");
	}
	void show();
}

class N implements V {
	public void show() {
		V.p();
	}
}

// Final methods abstract class
abstract class F {
	static int a = 15;
	final public void method() {
	    System.out.println("......");
	    System.out.println(a);
	}
	abstract void Method_2();
 }
 
 class G extends F {
	@Override
	void Method_2() {
        System.out.println(".............");	
	} 
 }


// Tao interface co 4 phuong thuc
interface A {
	void a();
	abstract void b();
	void c();
	abstract void d();
}

// static variable in interface
interface Cha extends A {
	static int a = 5;
	public static void method() {System.out.println(a);};
}

// Implement methods inherited from the interface
class M implements Cha {
	public void a() {
		System.out.println("I am a");
	}
	
	public void b() {
		System.out.println("I am b");
	}
	
	public void c() {
		System.out.println("I am c");
	}
	
	public void d() {
		System.out.println("I am d");
	}
}

// Tao abstract class de cai dat cho mot phuong thuc cua interface A
abstract class B implements A {
	public void a() {
		System.out.println("I am a");
	}
}

public class Abstraction {
    public static void main(String[] args) {
    	Cha.method();
    	M m = new M();
    	m.a();
    	F f = new G();
    	f.method();
    	f.Method_2();
    	V v = new N();
    	v.show();
	}
}