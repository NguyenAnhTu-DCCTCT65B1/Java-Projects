import java.util.Scanner;

public class DUONGTRON extends DIEM {
    	double r;
    	double pi = 3.14;
    	public DUONGTRON() {
    		System.out.print("\nThong tin cua hinh tron:");
    		Scanner t = new Scanner(System.in);
    		System.out.print("\nBan kinh duong tron: ");
    		r = t.nextDouble();
    	}
    	public double CHUVI() {
    		return r * 2 * pi;
    	}
    	public double DIENTICH() {
    		return r * r * pi;
    	}
    	public void TINH() {
    		System.out.print("Chu vi cua hinh tron là : " + CHUVI());
    		System.out.print("\nDien tich cua hinh tron là : " + DIENTICH());
    	}
    }
