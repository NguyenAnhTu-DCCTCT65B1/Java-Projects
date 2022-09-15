package exception_handling;
import java.util.Scanner;

/*
 * 1. Exception
 * a. Checked exception
 * - La cac lop extends tu Exception va duoc kiem tra tai compile-time (SQLException, ...)
 * 
 * b. Unchecked exception
 * - La cac lop extends tu Runtime exception (ArithmeticException, ArrayIndexOutOfBoundsException, ...) 
 * - Duoc kiem tra tai run-time
 * 
 * c. Error: la loi khong the sua duoc (OutOfMemoryError, ...)
 * 
 * NOTE: KHI NAO DUNG CHECKED EXCEPTION ? KHI NAO DUNG UNCHECKED EXCEPTION ?
 * - Neu 1 exception xay ra ma co the khac phuc duoc thi dung CHECKED EXCEPTION
 * - Neu 1 exception xay ra ma khong the khac phuc duoc thi dung UNCHECKED EXCEPTION
 * 
 * 2. Try - catch - finally
 * - Khoi lenh try duoc su dung de chua 1 doan code co the xay ra 1 ngoai le
 * - Khoi lenh catch duoc su dung de xu li cac exception.
 * - Khoi lenh finally duoc thuc thi cho du co ngoai le xay ra hay khong
 * 
 * NOTE: 
 * - Sau khoi lenh try phai co khoi lenh catch or finally or ca 2
 * - Chi co 1 khoi lenh finally duy nhat
 * - Khoi se khong duoc thuc thi neu chuong trinh bi thoat (System.exit())
 * 
 * VI SAO DUNG TRY - CATCH - FINALLY ?
 * - Khi khong dung try - catch, doan code se khong duoc thuc thi neu xay ra ngoai le - dung lai va hien thi loi do ra
 * => try - catch duoc du dung de khac phuc dieu do ( hay try - catch de bat loi exception va sua loi do )
 * - Dung finally de dong file, dong cac ket noi
 * 
 * 3. Da khoi lenh catch
 * - Thuc hien cac noi dung khac nhau ma o do xay ra cac exception khac nhau
 * 
 * NOTE:
 * - Chi xay ra 1 exception va chi co 1 khoi catch duoc thuc thi
 * - Tat ca cac khoi catch phai duoc sap xep tu loi rieng den loi chung, tuc la phai khai bao khoi lenh
 *   catch de xu li loi arithmetic exception truoc khi khai bao catch de xu li loi exception
 * 
 * 4. Try long nhau
 * - Doi khi chuong trinh co the phat sinh khi 1 khoi lenh xay ra 1 loi va toan bo khoi lenh chinh xay ra 1 loi khac
 * - Dung try long nhau khi co nhieu exception xay ra
 */

// Try - catch - finally
public class Try_Catch_Finally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		int a = 0;
		try {
			System.out.println("Nhap so nguyen a: ");
			a = sc.nextInt();
			// System.exit(a);
		} catch (Exception b) {
			System.out.println(b);
			System.out.println("Error !");
		} finally {
			System.out.println(".....");
		}
		System.out.println("Gia tri cua a la: " + a);
	}
}

