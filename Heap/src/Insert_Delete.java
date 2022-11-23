
public class Insert_Delete {
	
	int x;
	
	public void Insert(int A[], int n) {
		int i = n;
		int value = A[n];
		while (i > 1 && A[i / 2] < value) {
			// Kiem tra gia tri vua them voi parent (vi tri: i/2)
			// Gan gia tri do vao parent
			A[i] = A[i / 2];
			i = i / 2;
		}
		// Gan gia tri vua them vao vi tri thu i
		A[i] = value;
	}
	
	public int Delete(int A[], int n) {
		int i, j, temp, value;
		value = A[1];
		x = A[n];
		A[1] = A[n];
		A[n] = value;
		i = 1; j = i * 2;
		while (j <= n - 1) {
			if (j < n - 1 && A[j + 1] > A[j]) {
				j = j + 1;
			}
			if (A[i] < A[j]) {
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i = j;
				j = j * 2;
			}
			else {
				break;
			}
		}
		return value;
	}

	public static void main(String[] args) {
		int A[] = { 0,14,15,5,20,30,8,40 };
		Insert_Delete id = new Insert_Delete();
		System.out.print("Heap:\n");
		for (int i = 1; i < A.length; i++) {
			id.Insert(A, i);
		}
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.print("\nHeap Sort:\n");
		for (int i = 7; i > 1; i--) {
			id.Delete(A, i);
		}
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
}