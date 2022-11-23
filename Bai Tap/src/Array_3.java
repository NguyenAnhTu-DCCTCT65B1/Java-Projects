
public class Array_3 {
	
	public void Sort(int a[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j] ) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public void PhanTuTrungLap(int a[], int n) {
		Sort(a, n);
		int count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					count++;
					System.out.print(a[i] + " - " + count + " lan\n");
			    }
			}
			if (count > 1) {
				i = i + count;
			}
		}
	}
	
	public static void main(String[] args) {
		int a[] = { 5,9,9,10,15,14,6,6,6,1,0 };
		int n = a.length;
		Array_3 arr = new Array_3();
		arr.PhanTuTrungLap(a, n);
	}
}