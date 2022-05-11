import java.util.Scanner;

public class Saler {
	
	Scanner sc = new Scanner(System.in);
	private String name;
	private int Sales;
	
	public void setSaler() {
		System.out.print("Ten nhan vien: ");
        name = sc.nextLine();
        System.out.print("Doanh so ban hang: ");
        Sales = sc.nextInt();
	}
	
	public double getBouns() {
		return Sales * 5 / 100;
	}
	
	public void getSaler() {
		System.out.print("Ten nhan vien: " + name + " | " + "Doanh so ban hang: " + Sales + "\n");
	}
	
	public static void main(String[] args) {
        Saler sl = new Saler();
        sl.setSaler();
        sl.getSaler();
        System.out.print("Tien thuong la: " + sl.getBouns());
	}
}