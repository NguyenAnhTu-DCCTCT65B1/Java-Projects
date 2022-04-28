import java.util.Scanner;
import java.util.ArrayList;

public class Thisinh {
	
    private String Ten;
    private int DiemToan, DiemVan, DiemNN;
    Scanner sc=new Scanner(System.in);
    
    public Thisinh(){
        Ten = " ";
        DiemToan = DiemVan = DiemNN = 0;
    }
    
    public void Nhap(){
        System.out.print("Ten thi sinh: ");
        Ten = sc.nextLine();
        System.out.print("Diem Toan: ");
        DiemToan = sc.nextInt();
        System.out.print("Diem Van: ");
        DiemVan = sc.nextInt();
        System.out.print("Diem Ngoai Ngu: ");
        DiemNN = sc.nextInt();
    }
    
    public void IN(){
        System.out.print("Ten thi sinh: " + Ten);
        System.out.print("\nDiem mon Toan: " + DiemToan);
        System.out.print("\nDiem mon Van: " + DiemVan);
        System.out.print("\nDiem mon Ngoai Ngu: " + DiemNN);
        System.out.println("\nTong diem: " + (DiemToan + DiemVan + DiemNN));
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        Thisinh thisinh;
        ArrayList<Thisinh> arrThisinh = new ArrayList<>();
        System.out.print("Nhap so luong thi sinh: ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            thisinh = new Thisinh();
            System.out.println("Nhap thong tin thi sinh thu " + (i + 1) + ": ");
            thisinh.Nhap();
            arrThisinh.add(thisinh);
        }

        for (int i = 0; i < arrThisinh.size(); i++) {
            System.out.println("\nThong tin thi sinh thu " + (i+1) + ": ");
            arrThisinh.get(i).IN();
        }
    }
}