
public class Push_Pop {
	
	private int[] s; 
	private int top; 
	private int size;
	
	public Push_Pop(int n) {
		size = n;
		top = -1;
		s = new int[size];
	}
	
	public boolean isFull() {
		if (top == size) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}
	
	public void Push(int x) {
		if (isFull()) {
			return;
		}
		top++;
		s[top] = x; 
	}
	
	public int Pop() {
		if (isEmpty()) {
			return 0;
		}
		int temp = s[top];
		top--;
		return temp;
	}
	
	public void show() {
		for (int i = top; i > -1; i--) {
			System.out.println(s[i]);
		}
	}
	
	public static void main(String[] args) {
        Push_Pop st = new Push_Pop(10);
        System.out.println("Stack ban dau:");
		st.Push(20);
		st.Push(30);
		st.Push(40);
		st.show();
		System.out.println("Stack sau khi xoa:");
		st.Pop();
		st.show();
	}
}