import java.util.Scanner;

public class HangSachSu {
	
    Scanner sc = new Scanner(System.in);

    protected String loainguyenlieu;
    int a;
    
    HangSachSu() {
        System.out.print("Loai hang: ");
        loainguyenlieu = sc.nextLine();
    }
    
    public void  inlH() {
        System.out.print("Loai hang su dung: " + loainguyenlieu + "\n");
    }
    
    public static void main(String[] args) {
        HangSachSu a = new HangSachSu();
        a.inlH();
    }
}