
/*
 * Create a new node 
 */
public class Node {
	public int data;
	Node next;
	Node prev;
	Node(int value){
		data = value;
		next = prev = null;
	}
}
