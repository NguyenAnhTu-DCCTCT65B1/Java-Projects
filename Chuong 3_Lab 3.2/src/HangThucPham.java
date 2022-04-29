
public class HangThucPham {
	
    private NgayThang ngaysanxuat, ngayhethan;
    
    HangThucPham() {
    	System.out.println("Ngay san xuat: ");
        this.ngaysanxuat = new NgayThang();
        System.out.println("Ngay het han: ");
        this.ngayhethan = new NgayThang();
    }
    
    public void tgsd() {
        System.out.print("Thoi gian su dung: ");
        ngaysanxuat.inNT();
        System.out.print(" to ");
        ngayhethan.inNT();
    }
    
    public static void main(String[] args) {
        HangThucPham a = new HangThucPham();
        a.tgsd();
    }
}