
import java.util.Scanner;

public class TAMGIAC extends DIEM {
	private double a, b, c;
	public TAMGIAC() {
		System.out.print("\nThong tin cua tam giac:");
	    Scanner C = new Scanner(System.in);
	    System.out.print("\nNhap vao canh a: ");
		a = C.nextDouble();
		System.out.print("Nhap vao canh b: ");
		b = C.nextDouble();
		System.out.print("Nhap vao canh c: ");
		c = C.nextDouble();
    }
    public void KIEMTRA () {
	   	// Kiem tra xem 3 canh co phai la 3 canh cua 1 tam giac hay khong
	   	if (a < b + c && b < a + c && c < a + b) {
	   		if (a * a == b * b + c * c ||
	    		b * b == a * a + c * c ||
	    		c * c == a * a + b * b) {
	    		System.out.print("Day la tam giac vuong");	
	    	}
	    	// Dieu kien tam giac deu la 3 canh bang nhau
	    	if (a == b && b == c) {
	    		System.out.print("Day la tam giac deu");	
	    	}
	    	// Dieu kiem tam giac can la 2 canh bang nhau
	    	if (a == b || a == c || b == c) {
	    		System.out.print("Day la tam giac can");	
	    	}
	    	// Dieu kien tam giac tu la co 1 goc > 90 do
	    	if (a * a > b * b + c * c ||
	    		b * b > a * a + c * c ||
	    		c * c > a * a + b * b) {
	    		System.out.print("Day la tam giac tu");	
	    	}
	    	// Con lai la tam giac nhon
	    	else {
	    		System.out.print("Day la tam giac nhon");	
	    	}
	    }
	    // Dk 3 canh nhap vao ko phai la 3 canh cua 1 tam giac
	    else {
	    	System.out.print("Ba canh a, b, c ko phai la 3 canh cua tam giac");
	    }
    }
    public void CHUVI() {
    	double chuVi = 0;
    	if (a + b > c && a + c > b && b + c > a) {
    		chuVi = a + b + c; 
    		System.out.print("\nChu vi tam giac la: " + chuVi);	
    	}
    	else {
    		System.out.print("\nKhong tinh duoc chu vi tam giac");	
    	}
    }
    public void DIENTICH() {
    	double dienTich = 0;
    	if (a + b > c && a + c > b && b + c > a) {
    		dienTich = Math.sqrt(a + b + c);
    		System.out.print("\nDien tich tam giac la: " + dienTich + "\n\n");
    	}
    	else {
    		System.out.print("\nKhong tinh duoc dien tich" + "\n\n");
    	}
    }
}