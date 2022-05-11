import java.util.Scanner;

public class DUONGTRON extends DIEM {
   private int r;
   
   DUONGTRON() {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Nhap ban kinh hinh tron: ");
	   this.r = s.nextInt();
   }
   
   DUONGTRON(int x, int y, int r) {
	   super(x, y);
	   this.r = r;
   }
   
   public void INDUONGTRON() {
	   System.out.print("Toa do tam cua hinh tron la: ");
	   super.INDIEM();
	   System.out.println("Ban kinh cua hinh tron la: " + r);
   }
   
   // Tinh chu vi
   public double CHUVI() {
	   return 2 * 3.14 * r;
   }
   
   // Tinh dien tich
   public double DIENTICH() {
	   return 3.14 * r * r;
   }
   
   public static void main(String[] args) {
		System.out.println("Nhap toa do dinh va ban kinh hinh tron: ");
		DUONGTRON dt = new DUONGTRON();
		dt.INDUONGTRON();
		dt.CHUVI();
		System.out.println("Chu vi hinh tron la: " + dt.CHUVI());
		dt.DIENTICH();
		System.out.println("Dien tich hinh tron la: " + dt.DIENTICH());
		
		System.out.println("\nHinh tron thu 2: ");
		DUONGTRON dt1 = new DUONGTRON(0, 0, 5);
		dt1.INDUONGTRON();
		dt1.CHUVI();
		System.out.println("Chu vi hinh tron la: " + dt1.CHUVI());
		dt.DIENTICH();
		System.out.println("Dien tich hinh tron la: " + dt1.DIENTICH());
   }
}