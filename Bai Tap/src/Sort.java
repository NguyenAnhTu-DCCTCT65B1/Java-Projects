
public class Sort {
    
	// BUBBLE SORT: Doi cho 2 so lien tiep nhau neu chung dung sai thu tu
	public void Bubble_Sort(float a[], int n) {
		System.out.print("Bubble Sort:\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i] > a[j]) {
					float temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
    
	// SELECTION SORT: Tim vi tri de lua chon (On2)
    public void Selection_Sort(float a[], int n) {
    	System.out.print("Selection Sort:\n");
    	int i, j, k;
    	for (i = 0; i < n; i++) {
    		for (j = k = i; j < n; j++) {
    			if (a[j] < a[k]) {
    				k = j;
    			}
    		}
    		float temp = a[k];
    		a[k] = a[i];
    		a[i] = temp;
    	}
    }
    
    // INSERTION SORT: Tim vi tri de chen (On2)
    public void Insertion_Sort(float a[], int n) {
    	System.out.print("Insertion Sort:\n");
    	for (int i = 0; i < n; i++) {
    		int j = i - 1;
    		float temp = a[i];
    		while (j >= 0 && temp > a[j]) {
    			a[j + 1] = a[j];
    			j--;
    		}
    		a[j + 1] = temp;
    	}
    }
    
    public void Merge(float a[], int l, int mid, int h) {
    	float b[] = new float[9];
    	int i = l;
    	int j = mid + 1;
    	int k = l;
    	while (i <= mid && j <= h) {
    		if (a[i] < a[j]) {
    			b[k++] = a[i++];
    		}
    		else {
    			b[k++] = a[j++];
    		}
    	}
    	while (i <= mid) {
    		// Sao chep cac phan tu con lai cua mang dau tien neu co
    		b[k++] = a[i++];
    	}
    	while (j <= h) {
    		// Sao chep cac phan tu con lai cua mang thu hai neu co
    		b[k++] = a[j++];
    	}
    	for (int n = l; n <= h; n++) {
    		a[n] = b[n];
    	}
    }

    public void Merge_Sort(float a[], int l, int h) {
    	if (l < h) {
    		int mid = l + (h - l) / 2;
    		Merge_Sort(a, l, mid);
    		Merge_Sort(a, mid + 1, h);
    		Merge(a, l, mid, h);
    	}
    }
	
	public static void main(String[] args) {
		float a[] = { 3.5f, 6.8f, 9.0f, 0.5f, 1.2f, 4.8f, 7.0f, 20.1f, 15.7f };
        int n = a.length;
        Sort b = new Sort();
        
        b.Bubble_Sort(a, n);
        for (int i = 0; i < n; i++) {
	      	System.out.print(a[i] + " ");
        }
        
        System.out.print("\n\n");
        b.Selection_Sort(a, n);
        for (int i = 0; i < n; i++) {
	      	System.out.print(a[i] + " ");
        }
        
        System.out.print("\n\n");
        b.Insertion_Sort(a, n);
        for (int i = 0; i < n; i++) {
	      	System.out.print(a[i] + " ");
        }
        
        System.out.print("\n\n");
        System.out.print("Merge Sort:\n");
        b.Merge_Sort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
	      	System.out.print(a[i] + " ");
        }
	}
}