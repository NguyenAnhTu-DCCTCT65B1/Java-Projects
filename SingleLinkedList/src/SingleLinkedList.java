
public class SingleLinkedList {
	
	private Node head;
	
	public void HienThi() {
		Node p = head;
		while (p != null) {
			System.out.println(p.data);
			p = p.next;
		}
	}
	
	public void Them(int value, int pos) {		
		// Them vao vi tri dau
		if (pos == 0) {
			Node newNode = new Node(value);
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
		if (pos - 1 == 0) {
			// Xoa vi tri dau
			Node p = head;
			head = p.next;
			int value = p.data;
			p = null;
			return value;
		}
		else {
			// Xoa vi tri bat ki
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
		while (p != null) {
			count++;
			p = p.next;
		}
		return count;
	}

	public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        System.out.println("Cac phan tu sau khi them: ");
        sl.Them(50, 0);
        sl.Them(40, 0);
        sl.Them(30, 0);
        sl.Them(20, 0);
        sl.Them(10, 0);
        sl.Them(100, 2);
        sl.Them(200, 4);
        sl.HienThi();
        System.out.println("Cac phan tu sau khi xoa: ");
        sl.Xoa(1);
        sl.Xoa(5);
        sl.HienThi();
        sl.SoPhanTu();
        System.out.println("So phan tu la: " + sl.SoPhanTu());
	}
}