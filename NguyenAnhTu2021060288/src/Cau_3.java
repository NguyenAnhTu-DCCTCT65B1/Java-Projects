import java.util.Scanner;

public class Cau_3 {
	
	Scanner sc = new Scanner(System.in);
	private String name;
	private int Sales;
	private double TienThuong;
	
	public void Nhap() {
		int number = 0;
		System.out.print("Nhap so luong nhan vien: ");
		number = sc.nextInt();
		int stt = 0;
		for (int i = 0; i < number; i++) {
			stt = i + 1;
			System.out.print("Thong tin nhan vien thu " + stt + "\n");
		    System.out.print("Ten nhan vien: ");
		    sc.nextLine();
            name = sc.nextLine();
            System.out.print("Doanh so ban hang: ");
            Sales = sc.nextInt();
            System.out.print("Tien thuong: ");
            TienThuong = sc.nextDouble();
		}
	}
	
	public void Xuat() {
		System.out.print("Ten nhan vien" + "\t\t\t");
		System.out.print("Doanh so ban hang" + "\t\t\t");
		System.out.print("Tien thuong" + "\n");
		
		System.out.print(name + "\t\t\t\t");
		System.out.print(Sales + "\t\t\t\t\t");
		System.out.print(TienThuong + "\n");
	}
    
	public static void main(String[] args) {
		Cau_3 c = new Cau_3();
		c.Nhap();
        c.Xuat();
	}
}