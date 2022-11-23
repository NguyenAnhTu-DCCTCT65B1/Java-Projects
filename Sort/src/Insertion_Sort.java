// INSERTION SORT: Tim vi tri de chen (On2)
/*
   | 10 | 8 | 5 | 2 | 7 |  (temp = 8)
     j    i

=> | 8 | 10 | 5 | 2 | 7 |
     j   i

=> | 8 | 10 | 5 | 2 | 7 |  (temp = 5; i = 2; j = 1)
         j    i

=> | 5 | 8 | 10 | 2 | 7 |
         j   i

=> | 5 | 8 | 10 | 2 | 7 | (temp = 2 ; i = 3; j = 2)
             j    i

=> | 2 | 5 | 8 | 10 | 7 |
             j   i

=> | 2 | 5 | 7 | 8 | 10 | (temp = 7; i = 4; j = 3)
                 j   i
*/

public class Insertion_Sort {
	
	public void I_Sort(int B[], int n) {
        System.out.print("INSERTION SORT:\n");
        for (int i = 0; i < n; i++) {
        	int j = i - 1;
        	int temp = B[i];
        	while (j >= 0 && temp < B[j]) {
        		B[j + 1] = B[j];
        		j--;
        	}
        	B[j + 1] = temp;
        }
	}

	public static void main(String[] args) {
        int B[] = { 10,8,5,2,7 };
        int n = B.length;
        Insertion_Sort is = new Insertion_Sort();
        is.I_Sort(B, n);
        for (int i = 0; i < n; i++) {
        	System.out.print(B[i] + " ");
        }
	}
}