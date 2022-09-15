package java_collection;

import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;

enum Day {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class VD implements Comparable<VD> {
	
	private String name;
    private int age;
    private String address;
    
    public VD(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String toString() {
		return "Student: " + name + ", Age: " + age + ", Address: " + address;
	}
   
	public int compareTo(VD v) {
		return this.getName().compareTo(v.getName());
	}
	
	public static void main(String[] args) {
		TreeSet<VD> t = new TreeSet<VD>();
		VD v1 = new VD("A", 42, "Ha Noi");
		VD v2 = new VD("B", 22, "TP.HCM");
		VD v3 = new VD("C", 32, "BR-VT");
		t.add(v1);
		t.add(v2);
		t.add(v3);
		for (VD v : t) {
			System.out.println(v.toString());
		}
		
		System.out.println("\nWeek days:");
		Set<Day> s = EnumSet.of(Day.Monday, Day.Tuesday, Day.Wednesday);
		System.out.println(s);
		
		Set<Day> s2 = EnumSet.allOf(Day.class);
		System.out.println(s2);
		
		Set<Day> s3 = EnumSet.noneOf(Day.class);
		System.out.println(s3);
	}
}