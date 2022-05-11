import java.util.Scanner;

public class DIEM {
	
	private int x, y;
	
	DIEM(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	DIEM() {
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y = s.nextInt();
	}
	
	public void INDIEM() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	public static void main(String[] args) {
		DIEM d = new DIEM();
		d.INDIEM();
	}
}