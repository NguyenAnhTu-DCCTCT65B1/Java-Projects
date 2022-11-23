
public class Array_1 {
    
	public void Tong(int A[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (A[i] + A[j] == 15) {
					System.out.print(A[i] + " " + A[j] + "\n");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int A[] = { 5,9,7,10,15,20,6,3,1,14,0 };
        int n = A.length;
        Array_1 arr = new Array_1();
        arr.Tong(A, n);
	}
}