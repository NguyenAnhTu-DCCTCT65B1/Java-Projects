import java.util.Scanner;

public class NgayThang {
	
    Scanner sc = new Scanner(System.in);
    int ngay, thang, nam;
    
    NgayThang() {
        System.out.print("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();
    }
    
    NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
    public void inNT() {
        System.out.print("Ngay/thang/nam: " + ngay + " / " + thang + " / " + nam + "\n");
    }

    public static void main(String[] args) {
       NgayThang a = new NgayThang();
       a.inNT();
    }
}