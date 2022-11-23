import java.util.ArrayList;

public class BST {
	
	private Node root;
	
	public BST() {
		root = null;
	}
	
	public void pre_order() {
		pre_order(root);
	}
	
	public void in_order() {
		in_order(root);
	}
	
	public void post_order() {
		post_order(root);
	}
	
	public Node getRoot() {
		return root;
	}
	
	public void R_Insert(int key, Node p) {
		// Kiem tra neu 1 not khong khoi tao dc
		if (p == null) {
			System.out.print("KHONG KHOI TAO DUOC CAY");
			return;
		}
		// Neu key nho hon node hien tai thi duyet het ben trai cua nut goc (root)
		if (key < p.data) {
			if (p.leftChild != null) {
				R_Insert(key, p.leftChild);
			}
			else {
				//Them node moi vao ben trai cua node hien tai
				p.leftChild = new Node(key);
			}
		}
		// Neu key lon hon node hien tai thi duyet het ben phai cua nut goc (root)
		else if (key > p.data) {
			if (p.rightChild != null) {
				R_Insert(key, p.rightChild);
			}
			else {
				//Them node moi vao ben phai cua node hien tai
				p.rightChild = new Node(key);
			}
		}
		else {
			// Neu node hien tai = key
			return;
		}
	}
	
	public void Insert(int key) {
		if (root == null) {
			root = new Node(key);
		}
		else {
			R_Insert(key, root);
		}
	}
	
	public void Search(int key, Node p) {
		if (p == null) {
			System.out.println("KHONG TIM THAY " + key);
		    return;
		}
		if (p.data == key) {
			System.out.println("Tim thay " + key);
		    return;
		}
		else if (key < p.data) {
		    Search(key, p.leftChild);
		}
		else {
			Search(key, p.rightChild);
		}
	}
	
	public void pre_order(Node p) {
		if (p == null) {
			return;
		}
		System.out.print(p.data + " ");
		pre_order(p.leftChild);
		pre_order(p.rightChild);
	}
	
	public void in_order(Node p) {
		if (p == null) {
			return;
		}
		in_order(p.leftChild);
		System.out.print(p.data + " ");
		in_order(p.rightChild);
	}
	
	public void post_order(Node p) {
		if (p == null) {
			return;
		}
		post_order(p.leftChild);
		post_order(p.rightChild);
		System.out.print(p.data + " ");
	}
	
	public static void main(String[] args) {
        BST bst = new BST();
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(8);
        arr.add(15);
        arr.add(35);
        //int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.size(); i++) {
        	bst.Insert(arr.get(i));
        }
        bst.pre_order();
        System.out.print("\n");
        bst.in_order();
        System.out.print("\n");
        bst.post_order();
        System.out.print("\n");
        bst.Search(36, bst.getRoot());
	}
}