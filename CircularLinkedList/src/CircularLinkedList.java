
public class CircularLinkedList {
	
	private Node head;
	
	public void Them(int value, int pos) {
		// Neu danh sach rong thi mac dinh la Node dau
		if (head == null) {
			Node newNode = new Node(value);
			head = newNode;
			newNode.next = head;
			return;
		}
		// Them vao vi tri dau
		if (pos == 0) {
			Node newNode = new Node(value);
			Node p = head;
			do {
				p = p.next;
			} while (p.next != head);
			p.next = newNode;
			newNode.next = head;
			head = newNode;
			return;
		}
		// Them vao vi tri bat ki
		else {
			Node newNode = new Node(value);
			Node p = head;
			for (int i = 0; i < pos - 1; i++) {
				p = p.next;
			}
			newNode.next = p.next;
			p.next = newNode;
		}
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}
	
	public int Xoa(int pos) {
		// Kiem tra danh sach rong hay ko
		if (isEmpty()) {
			return -1;
		}
		// Xoa vi tri dau
		if (pos - 1 == 0) {
			Node p = head;
			Node q = head;
			do {
				p = p.next;
			} while (p.next != head);
			head = q.next;
			int value = q.data;
			q = null;
			p.next = head;
			return value;
		}
		// Xoa vi tri bat ki
		else {
			Node p = head;
			Node q = head;
			for (int i = 0; i < pos - 1; i++) {
				q = p;
				p = p.next;
			}
			q.next = p.next;
			int value = p.data;
			p = null;
			return value;
		}
	}
	
	public int SoPhanTu() {
		Node p = head;
		int count = 0;
		do {
			count++;
			p = p.next;
		} while (p != head);
		return count;
	}
	
	public void HienThi() {
		Node p = head;
		do {
			System.out.println(p.data);
			p = p.next;
		} while (p != head);
	}

	public static void main(String[] args) {
		CircularLinkedList ls = new CircularLinkedList();
		System.out.println("Danh sach sau khi them: ");
		ls.Them(100, 0);
		ls.Them(90, 0);
		ls.Them(80, 0);
		ls.Them(70, 0);
		ls.Them(60, 0);
		ls.Them(1, 1);
		ls.Them(2, 6);
		ls.HienThi();
		System.out.println("Danh sach sau khi xoa: " + ls.Xoa(3));
		ls.HienThi();
		System.out.println("Danh sach sau khi xoa: " + ls.Xoa(6));
		ls.HienThi();
		ls.SoPhanTu();
		System.out.println("So phan tu la: " + ls.SoPhanTu());
	}
}