
public class SACH {
	
	private String ma, ten, tacgia, loai, NXB;
	private int sotrang, sotap;
	private float gia;
	
	public SACH(String ma, String ten, String tacgia, String loai, String NXB,
			int sotrang, int sotap, float gia) {
		this.ma = ma;
		this.ten = ten;
		this.tacgia = tacgia;
		this.loai = loai;
		this.NXB = NXB;
		this.sotrang = sotrang;
		this.sotap = sotap;
		this.gia = gia;
	}
	
	public String toString() {
		return "Ma: " + ma + "\nTen: " + ten + "\nTac gia: " + tacgia +
				"\nLoai: " + loai + "\nNXB: " + NXB + "\nSo trang: " + sotrang
				+ "\nSo tap: " + sotap + "\nGia: " + gia;
	}
	
	public void INSACH() {
		System.out.print("Ma " + "\t");
		System.out.print("Ten " + "\t");
		System.out.print("Tac gia" + "\t\t");
		System.out.print("Loai" + "\t\t");
	    System.out.print("NXB" + "\t\t");
	    System.out.print("So Trang" + "\t");
	    System.out.print("So tap" + "\t\t");
	    System.out.print("Gia" + "\n");
	    
		System.out.print(ma + "\t");
		System.out.print(ten + "\t");
		System.out.print(tacgia + "\t");
		System.out.print(loai + "\t");
		System.out.print(NXB + "\t\t");
		System.out.print(sotrang + "\t\t");
		System.out.print(sotap + "\t\t");
		System.out.print(gia + "\n");
	}

	public static void main(String[] args) {
		SACH s = new SACH("1", "ABC", "Nguyen Van A", "Tieu thuyet", "Dai hoc",
				150, 5, 500000);
		System.out.println(s);
		System.out.println("\nDanh sach sau khi nhap la:");
		s.INSACH();
	}
}