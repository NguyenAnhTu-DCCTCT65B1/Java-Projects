import java.util.Stack;

public class CheckBrackets {

	public static void main(String[] args) {
	    String s = "((a + b) * (c + d))";
	    Stack<Integer> st = new Stack<Integer>();
	    for (int i = 0; i < s.length(); i++) {
	    	if (s.charAt(i) == '(') {
	    		st.push(i);
	    	}
	    	else {
	    		if (s.charAt(i) == ')') {
	    			if (st.empty()) {
	    				System.out.println("KO HOP LE !");
	    				return;
	    			}
	    			else {
	    				st.pop();
	    			}
	    		}
	    	}
	    }
	    
	    if (st.empty()) {
			System.out.println("HOP LE !");
		}
		else {
			System.out.println("KO HOP LE !");
			while (!st.empty()) {
				st.pop();
			}
		}
	}
}