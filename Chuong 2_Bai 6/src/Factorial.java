import java.text.DecimalFormat;
import java.util.Scanner;

public class Factorial {
	
	public static long TinhGiaiThua(int n) {
		long GiaiThua = 1;
		if (n == 0 || n == 1) {
			return GiaiThua;
		}
		else {
			int i = 2;
			do {
				GiaiThua *= i;
				i++;
			} while (i <= n);
			return GiaiThua;
		}
	}

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Nhap so: ");
		 int n = scanner.nextInt();
		 System.out.println("Giai thua cua " + n + " la " + TinhGiaiThua(n));
	}
}