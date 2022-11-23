
public class Array_2 {
	
	public void GopMang() {
		int A[] = { 3,4,6,7,9 };
		int B[] = { 0,1,5,8,10,12 };
		
		int sizeofA = A.length;
		int sizeofB = B.length;
		int sizeofArr = sizeofA + sizeofB;
		
		int C[] = new int[sizeofArr];
		
		// Gan mang A vao mang C
		int i = 0, k = 0;
		while (i < A.length) {
			C[k] = A[i];
			k++;
			i++;
		}
		k = A.length;
		
		// Gan mang B vao mang C
		int j = 0;
		while (j < B.length) {
			C[k] = B[j];
			j++;
			k++;
		}
        	
		for (i = 0; i < sizeofArr; i++) {
			for (j = i + 1; j < sizeofArr; j++) {
				if (C[i] > C[j]) {
					 int temp = C[i];
					 C[i] = C[j];
					 C[j] = temp;
				}
			}
		}
		
		System.out.print("Mang sap xep theo thu tu tang dan: \n");
		for (i = 0; i < sizeofArr; i++) {
			System.out.print(C[i] + " ");
		}
	}

	public static void main(String[] args) {
		Array_2 arr = new Array_2();
		arr.GopMang();
	}
}