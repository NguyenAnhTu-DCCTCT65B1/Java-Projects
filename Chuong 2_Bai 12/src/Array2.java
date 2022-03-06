import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		// khai bao so dong, so cot cua ma tran
		int m, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so dong cua ma tran: ");
	    m = scanner.nextInt();
	    System.out.println("Nhap so cot cua ma tran: ");
	    n = scanner.nextInt();
        
	    // khai bao ma tran A co m dong, n cot
	    int A[][] = new int [m][n];
	    System.out.println("Nhap cac phan tu cua ma tran: ");
	    for (int i = 0; i < m; i++) {
	    	for (int j = 0; j < n; j++) {
	    		  System.out.print("A[" + i + "][" + j +"] = ");
	    		  A[i][j] = scanner.nextInt();
	    	}
	    }
	    // Tim phan tu co gia tri lon nhat
	    // gia su [0,0] la phan tu lon nhat
	    int max = A[0][0];
	    for (int i = 0; i < m; i++) {
	    	for (int j = 0; j < n; j++) {
	    		if (max < A[i][j]) {
	    			max = A[i][j];
	    		}
	    	}
	    }
	    System.out.println("Phan tu lon nhat trong ma tran la: " + max);
	}
}