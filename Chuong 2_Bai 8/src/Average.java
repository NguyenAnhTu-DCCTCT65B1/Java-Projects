import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		  int n, sum = 0, number;
	      float averageNumber;
	      Scanner scanner = new Scanner(System.in);
	         
	      // lam tron den 2 chu so thap phan
	      DecimalFormat decimalFormat = new DecimalFormat("#.##");    
	        
	      System.out.println("Nhap cac so nguyen co trong day: ");
	      n = scanner.nextInt();
	       
	      for (int i = 1; i <=n; i++) {
	          System.out.println("Nhap so thu " + i + ": ");
	          number = scanner.nextInt();
	          sum += number;
	      }
	         
	      averageNumber = (float) sum / n;
	      System.out.println("Trung binh cong la: " + decimalFormat.format(averageNumber));
    }
}