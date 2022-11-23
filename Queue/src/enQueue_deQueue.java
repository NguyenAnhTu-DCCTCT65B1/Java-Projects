
public class enQueue_deQueue {
	
	private int[] s;
	private int size;
	private int front;
	private int tail;
	
	public enQueue_deQueue(int n) {
		size = n;
		front = -1;
		tail = -1;
		s = new int[size];
	}
	
	public boolean isFull() {
		if (tail == size - 1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if (front == tail) {
			return true;
		}
		return false;
	}
	
	public void enQueue(int x) {
		if (isFull()) {
			return;
		}
		s[++tail] = x;
	}
	
	public int deQueue() {
		if (isEmpty()) {
			return 0;
		}
		int value = s[++front];
		return value;
	}
	
	public void show() {
		for (int i = front + 1; i <= tail; i++) {
			System.out.println(s[i]);
		}
	}

	public static void main(String[] args) {
		enQueue_deQueue st = new enQueue_deQueue(10);
		System.out.println("Queue ban dau:");
		st.enQueue(100);
		st.enQueue(200);
		st.enQueue(300);
		st.enQueue(400);
		st.show();
		System.out.println("Queue sau khi xoa:");
		st.deQueue();
		st.deQueue();
		st.show();
	}
}