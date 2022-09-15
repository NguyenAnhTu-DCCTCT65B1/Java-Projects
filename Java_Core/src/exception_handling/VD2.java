package exception_handling;

// Khoi lenh try long nhau
public class VD2 {
    
	public static void main(String[] args) {
	    try {
	        String s = "abc";
	        int i = Integer.parseInt(s);
	        System.out.println(i);
	        
	    	try {
	    		int n = 60 / 0;
	    		System.out.println(n);
	    	} catch (ArithmeticException e) {
	    		System.out.println("Loi phep tinh");
	    	}
	    	
	    	try {
				int a[] = new int[10];
				a[11] = 10;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds Exception");
			}
	    	System.out.println("...");
	    	
	    } catch (Exception e) {
	    	System.out.println("Exception handling");
	    }
	    System.out.println("Continue...");
	}
}