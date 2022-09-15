package exception_handling;

/*
 * 1. Throw
 * - Duoc su dung de nem ra 1 ngoai le cu the
 * - Checked Exception khong duoc nem ra ngoai
 * - Sau throw la 1 instance
 * - Throw duoc dung trong method
 * - Khong the throw nhieu exception
 * 
 * NOTE: dung throw khi co CHECKED EXCEPTION or UNCHECKED EXCEPTION
 */

public class Throw {
	
	public void Test(int age) {
		try {
			if (age < 20) {
				System.out.println("Khong hop le !");
			}
			else {
				System.out.println("Hello");
			}
			
		} catch (ArithmeticException e) {
			System.out.println(".......");
		}
	}
	
	public static void main(String[] args) {
		Throw t = new Throw();
		t.Test(44);
		System.out.println("Continue...");
	}
}