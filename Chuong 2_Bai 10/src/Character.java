import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		String chuoi;
		char kiTu;
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ki: ");
	    chuoi = scanner.nextLine();
	    
	    System.out.println("Cac ki tu co trong chuoi la: ");
        for (int i = 0; i < chuoi.length(); i++) {
        	kiTu = chuoi.charAt(i);
        	System.out.println(kiTu);
        }
	}
}