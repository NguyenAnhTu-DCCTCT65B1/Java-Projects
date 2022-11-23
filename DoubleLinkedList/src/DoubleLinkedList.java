
public class DoubleLinkedList {

		private Node head;
		
		public void Them(int value, int pos) {
			// Neu danh sach rong thi mac dinh la Node dau
			if (head == null) {
				Node newNode = new Node(value);
				head = newNode;
				return;
			}
			// Them vao vi tri dau 
			if (pos == 0) {
				Node newNode = new Node(value);
				newNode.next = head;
				head.prev = newNode;
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
				// gan newNode vao danh sach
				newNode.next = p.next;
				newNode.prev = p;
			    // Thay doi danh sach cu
				if (p.next != null) {
					newNode.next.prev = newNode;
					// Neu them vao cuoi thi khong chay dieu kien nay
				}
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
			// Kiem tra danh sach co rong hay ko
			if (isEmpty()) {
				return -1;
			}
			if (pos == 0) {
				Node p = head;
				head = head.next;
				int value = p.data;
				head.prev = null;
				return value;
			}
			// Xoa vi tri bat ki
			else {
				Node p = head;
				for (int i = 0; i < pos - 1; i++) {
					p = p.next;
				}
				p.prev.next = p.next;
				if (p.next != null) {
					p.next.prev = p.prev;
				}
				int value = p.data;
				return value;
			}
		}
		
		public void HienThi() {
			Node p = head;
			while (p != null) {
				System.out.println(p.data);
				p = p.next;
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
			DoubleLinkedList dll = new DoubleLinkedList();
			System.out.println("Cac phan tu sau khi them: ");
			dll.Them(1, 0);
			dll.Them(2, 0);
			dll.Them(3, 0);
			dll.Them(4, 0);
			dll.Them(5, 2);
			dll.Them(6, 5);
			dll.HienThi();
			System.out.println("Cac phan tu sau khi xoa: ");
			dll.Xoa(2);
			dll.Xoa(4);
			dll.HienThi();
			dll.SoPhanTu();
			System.out.println("So phan tu la: " + dll.SoPhanTu());
		}
	}