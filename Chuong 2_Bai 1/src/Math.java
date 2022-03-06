import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Math {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     DecimalFormat decimalFormat = new DecimalFormat("#.##");
	     
	     System.out.println("Nhap a: ");
	     int a = scanner.nextInt();
	     System.out.println("Nhap b: ");
         int b = scanner.nextInt();
	     
         // Tinh tong, hieu, tich, thuong, lay phan du cua 2 so do
         int Tong = a + b;
         System.out.println(a + " + " + b + " = " + Tong);
         int Hieu = a - b;
         System.out.println(a + " - " + b + " = " + Hieu);
         int Tich = a * b;
         System.out.println(a + " * " + b + " = " + Tich);
         float Thuong = (float) a / b;
         System.out.println(a + " / " + b + " = " + decimalFormat.format(Thuong));
         int PhanDu = a % b;
         System.out.println(a + " % " + b + " = " + PhanDu);
         
         // Dung cac toan tu so sanh da hoc de so sanh 2 so do
         System.out.println("Ket qua so sanh bang 2 so " + a + " va " + b + " la " + (a == b));
         System.out.println("Ket qua so sanh ko bang 2 so " + a + " va " + b + " la " + (a != b));
         System.out.println("Ket qua so sanh > hon 2 so " + a + " va " + b + " la " + (a > b));
         System.out.println("Ket qua so sanh >= 2 so " + a + " va " + b + " la " + (a >= b));
         System.out.println("Ket qua so sanh < hon 2 so " + a + " va " + b + " la " + (a < b));
         System.out.println("Ket qua so sanh <= 2 so " + a + " va " + b + " la " + (a <= b));
	}
}