package oop;

/*
 * Da hinh luc runtime la qua trinh goi phuong thuc da duoc ghi ðe trong thoi gian thuc thi chuong trinh
 * => Mot phuong thuc ðuoc ghi ðe ðuoc goi thong qua ref cua lop cha
 * VD: class A{}  
 *     class B extends A{}  
 *     A a = new B();
*/

class Person {
	public void Run() {
		System.out.println("Running");
	}
}

class Student extends Person {
	public void Run() {
		System.out.println("Running 20km");
	}
}

class Employee extends Person {
	public void Run() {
		System.out.println("Running 15km");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
        Person p = new Student();
        p.Run();
        p = new Employee();
        p.Run();
	}
}