import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree {
	
	private Node root;
	Scanner t = new Scanner(System.in);
	
	public void pre_order() {
		pre_order(root);
	}
	
	public void in_order() {
		in_order(root);
	}
	
	public void post_order() {
		post_order(root);
	}
	
	public void createTree() {
		// B1: Tao root
		int value;
		System.out.print("Nhap gia tri nut goc: ");
		value = t.nextInt();
		root = new Node(value);
		// B2: Gan root vao queue
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		Node p;
		while (!Q.isEmpty()) {
			// B3: Lay dia chi cua Node hien tai trong queue
			p = Q.poll();
			// B4: Lay dia chi ra khoi queue
			Q.peek();
			// Nhap gia tri nut trai
			System.out.print("Nhap gia tri nut trai cua " + p.data + ": ");
			value = t.nextInt();
            if (value != 0) {
            	// B6: Day nut trai vao queue
            	Node newNode = new Node(value);
            	p.leftChild = newNode;
            	Q.add(newNode);
            }
            // B7: Nhap gia tri nut phai
            System.out.print("Nhap gia tri nut phai cua " + p.data + ": ");
            value = t.nextInt();
            if (value != 0) {
            	// B8: Day nut phai vao queue
            	Node newNode = new Node(value);
            	p.rightChild = newNode;
            	Q.add(newNode);
            }
		}
	}
	
    public void pre_order(Node root) {
    	if (root == null) {
    		return;
    	}
    	System.out.print(root.data + " ");
    	pre_order(root.leftChild);
    	pre_order(root.rightChild);
    }
    
    public void in_order(Node root) {
    	if (root == null) {
    		return;
    	}
    	in_order(root.leftChild);
    	System.out.print(root.data + " ");
    	in_order(root.rightChild);
    }
    
    public void post_order(Node root) {
    	if (root == null) {
    		return;
    	}
    	post_order(root.leftChild);
    	post_order(root.rightChild);
    	System.out.print(root.data + " ");
    }
	
	public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        b.createTree();
    	System.out.print("\nPre_order: ");
    	b.pre_order();
    	System.out.print("\nIn_order: ");
    	b.in_order();
    	System.out.print("\nPost_order: ");
    	b.post_order();
	}
}