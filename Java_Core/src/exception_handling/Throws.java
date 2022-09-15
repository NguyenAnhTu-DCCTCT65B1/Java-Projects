package exception_handling;

import java.io.IOException;

/*
 * 2. Throws
 * - Duoc dung de khai bao exception
 * - Checked Exception duoc nem ra ngoai
 * - Sau throws la 1 or nhieu class
 * - Co the khai bao nhieu exception
 * 
 * NOTE: dung throws khi co CHECKED EXCEPTION
 */

class A {
	void m() throws IOException {
		throw new ArithmeticException("Error");
	}
	
	void n() throws IOException {
		m();
	}
}

public class Throws {
	
    public static void main(String[] args) {
		try {
			
			A t = new A();
			t.n();
		} catch (Exception e) {
			System.out.println("Continue...");
		}
	}
}