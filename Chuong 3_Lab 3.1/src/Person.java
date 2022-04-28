import java.util.Scanner;

public class Person {
	
	private String ten, ngaySinh, gioiTinh, queQuan;
	Scanner s = new Scanner(System.in);
	
	public Person() {
	    System.out.print("Ten: ");
        ten = s.nextLine();
        System.out.print("Ngay sinh: ");
        ngaySinh = s.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh = s.nextLine();
        System.out.print("Que quan: ");
        queQuan = s.nextLine();
	}
	
	public Person(String ten, String ngaySinh, String gioiTinh, String queQuan) {
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
	}
	
	public void IN() {
		System.out.print("Ten: " + ten + "; Ngay sinh: " + ngaySinh
				+ "; Gioi tinh: " + gioiTinh + "; Que quan: " + queQuan);
	}

	public static void main(String[] args) {
		Person p = new Person();
	    p.IN();
	}
}