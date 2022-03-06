import java.util.Scanner;

public class Array1 {
	
	// Sap xep mang so nguyen theo thu tu tang dan
	public static void sortASC(int arr[]) {
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	// In cac phan tu cua mang ra man hinh
	public static void show(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
	    int n = scanner.nextInt();
	    
	    // Khoi tao array
	    int arr[] = new int[n];
	    System.out.print("Nhap cac phan tu cua mang: \n");
	   
        for (int i = 0; i < n; i++) {
        	 System.out.printf("a[%d] = ", i);
        	 arr[i] = scanner.nextInt();
        }
        
       	System.out.print("Mang ban dau la: \n");
        for (int i = 0; i < n; i++) {
	    	System.out.print(arr[i] + "    ");
	    }
        
        // Sap xep day so theo thu tu tang dan
        sortASC(arr);
        System.out.println("\nDay so sau khi sap xep tang dan: ");
        show(arr);
	}
}