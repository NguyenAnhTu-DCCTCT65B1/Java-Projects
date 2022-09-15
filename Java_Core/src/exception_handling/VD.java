package exception_handling;
/*
 - Neu chia bat ki so nao cho 0 => xay ra ArithmeticException
   VD: int a = 50/0;
 
 - Neu chen bat ki value nao vao index sai => xay ra ArrayIndexOutOfBoundsException 
   VD: int a[] = new int[5];  
       a[10] = 50;
   
 - Bat ki bien nao co value la null, thuc hien bat ki hoat dong nao boi bien do => xay ra NullPointerException
   VD: String s = null;  
   System.out.println(s.length());
   
 - Dinh dang sai kieu data cua bat ki value nao => xay ra NumberFormatException
   VD: String s = "abc";  
   int i = Integer.parseInt(s);
*/

// Da khoi lenh catch
public class VD {
  
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[6] = 30 / 1;
		} catch (ArithmeticException e1) {
			System.out.println("Nhiem vu 1");
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Nhiem vu 2");
		} catch (Exception e3) {
			System.out.println("Nhiem vu 3");
		} finally {
			System.out.println("End !");
		}		
	}
}