
public class BST {
	
	int data;
	BST leftChild;
	BST rightChild;
	BST (int value) {
		data = value;
		leftChild = rightChild = null;
	}
	
	private BST root;
	
	public BST() {
		root = null;
	}
	
	public BST getRoot() {
		return root;
	}
	
	public void R_Insert(int key, BST p) {
		if (p == null) {
			System.out.print("Ko khoi tao duoc cay");
			return;
		}
		// Neu key nho hon node hien tai thi duyet het ben trai cua nut goc (root)
		if (key < p.data) {
			if (p.leftChild != null) {
				R_Insert(key, p.leftChild);
			}
			else {
				// Them node moi vao ben trai cua node hien tai
				p.leftChild = new BST(key);
			}
		}
		// Neu key lon hon node hien tai thi duyet het ben phai cua nut goc (root)
		else if (key > p.data) {
			if (p.rightChild != null) {
				R_Insert(key, p.rightChild);
			}
			else {
				// Them node moi vao ben phai cua node hien tai
				p.rightChild = new BST(key);
			}
		}
		else {
			// Neu node hien tai = key
			return;
		}
	}
	
	public void Insert(int key) {
		if (root == null) {
			root = new BST(key);
		}
		else {
			R_Insert(key, root);
		}
	}
	
	public int max(BST p) {
		// Neu node cha ma khong co cay con phai thi node cha nay chinh la 
		// node ngoai cung lon nhat cua cay con phai
		// cung chinh la node co gia tri lon nhat
		if (p.rightChild == null) {
			return p.data;
		}
		// Duyet den node cuoi cung ben cay con phai => de tim gia tri lon nhat
		return max(p.rightChild);
	}
	
	public int min(BST p) {
		// Neu node cha ma khong co cay con trai thi node cha nay chinh la 
		// node ngoai cung lon nhat cua cay con trai
		// cung chinh la node co gia tri nho nhat
		if (p.leftChild == null) {
			return p.data;
		}
		// Duyet den node cuoi cung ben cay con trai => de tim gia tri nho nhat
		return min(p.leftChild);
	}
	
	public static void main(String[] args) {
        int a[] = { 8,5,9,10,2,3,11,15,20 };
        int n = a.length;
        BST bst = new BST();
        for (int i = 0; i < n; i++) {
        	bst.Insert(a[i]);
        }
        System.out.print("Max cua BST la: " + bst.max(bst.getRoot()) + "\n");
        System.out.print("Min cua BST la: " + bst.min(bst.getRoot()));
	}
}
