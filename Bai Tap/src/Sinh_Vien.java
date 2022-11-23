import java.util.Scanner;

public class Sinh_Vien {
	Scanner s = new Scanner(System.in);
	float Toan;
	float Li;
	float Hoa;
	float Diem;
	String MaSV;
	String HoTen;
    Sinh_Vien monhoc;
    
    public void NhapSV() {
    	int n;
    	System.out.print("Nhap so luong sinh vien: ");
    	n = s.nextInt();
    	for (int i = 0; i < n; i++) {
    		System.out.print("\nThong tin sinh vien thu: " + (i + 1));
    		System.out.print("\nHo va ten: ");
    		s.next();
    		HoTen = s.nextLine();
    		System.out.print("Ma SV: ");
    		MaSV = s.nextLine();
    		System.out.print("Diem toan: ");
    		Toan = s.nextFloat();
    		System.out.print("Diem li: ");
    		Li = s.nextFloat();
    		System.out.print("Diem hoa: ");
    		Hoa = s.nextFloat();
    	}
    }
    
    public void HienThi() {
        
    }
	
	public static void main(String[] args) {
		Sinh_Vien sv = new Sinh_Vien();
		sv.NhapSV();
		sv.HienThi();
	}
}