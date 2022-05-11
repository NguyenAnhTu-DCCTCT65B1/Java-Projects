
public class TAMGIAC {
	
	private DIEM a, b, c;
	
	TAMGIAC() {
		a = new DIEM();
		b = new DIEM();
		c = new DIEM();	
	}
	
	public void INTAMGIAC() {
		System.out.println("Toa do 3 dinh cua tam giac la: ");
		System.out.print("a"); a.INDIEM();
		System.out.print("b"); b.INDIEM();
		System.out.print("c"); c.INDIEM();
	}
	
	public static void main(String[] args) {
		System.out.println("Nhap 3 dinh cua tam giac: ");
		TAMGIAC tg = new TAMGIAC();
		tg.INTAMGIAC();
	}
}  