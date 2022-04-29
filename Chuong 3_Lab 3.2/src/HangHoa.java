import java.util.Scanner;

public class HangHoa {
	
    Scanner sc = new Scanner(System.in);
    String mahang, tenhang, Nhasanxuat;
    int gia;
    private HangThucPham Htp;
    private HangSachSu Hss;
    private HangDienMay Hdm;
    
    public void Nhap() {
        Htp = new HangThucPham();
        System.out.println("---------------------");
        Hss = new HangSachSu();
        System.out.println("---------------------");
        Hdm = new HangDienMay(); 
        System.out.println("---------------------");
        System.out.print("Nhap ma hang: ");
        mahang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        tenhang = sc.nextLine();
        System.out.print("Nhap nha san xuat: ");
        Nhasanxuat = sc.nextLine();
        System.out.print("Nhap gia: ");
        gia = sc.nextInt();
    }
    
    public void intthanghoa() {
        System.out.println("---------------------");    
        Htp.tgsd();
        System.out.println("---------------------");
        Hss.inlH();
        System.out.println("---------------------");
        Hdm.intTThangdienmay();
        System.out.println("---------------------");
        System.out.print("Ma hang: " + mahang + " | Nhap tenhang: " + tenhang + " "
        		+ "| Nhasanxuat: " + Nhasanxuat + " | Nhasanxuat: " + Nhasanxuat + "\n");
        System.out.println("---------------------");
    }
    
    public static void main(String[] args) throws Exception {
        HangHoa a = new HangHoa();
        a.Nhap();
        a.intthanghoa();
    }
 }