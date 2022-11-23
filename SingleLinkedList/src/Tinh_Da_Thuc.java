import java.util.Scanner;

public class Tinh_Da_Thuc {
	
	private Da_Thuc kq;
	
	public Tinh_Da_Thuc() {
		kq = null;
	}
	
    public Da_Thuc ThemCuoi(Da_Thuc p, int hs, int sm) {
		Da_Thuc newNode = new Da_Thuc(hs, sm);
		if (p == null) {
			p = newNode;
		}
		else {
			Da_Thuc r = p;
			while (r.next != null) {
				r = r.next;
			}
			r.next = newNode;
		}
		return p;
	}
    
    // Ham cong 2 da thuc
    public Da_Thuc Cong2DaThuc(Da_Thuc p1, Da_Thuc p2) {
    	if (p1 == null || p2 == null) {
    		System.out.println("Ko the thuc hien phep cong da thuc khi"
    				+ " 1 trong 2 da thuc la null\n");
    		return null;
    	}
    	while (p1 != null && p2 != null) {
    		if (p1.sm == p2.sm) {
    			kq = ThemCuoi(kq, p1.hs + p2.hs, p1.sm);
    			p1 = p1.next;
    			p2 = p2.next;
    		}
    		else {
    			if (p1.sm > p2.sm) {
    				kq = ThemCuoi(kq, p1.hs, p1.sm);
    				p1 = p1.next;
    				if (p1 == null && p2 != null) {
    					// Neu da thuc chi co duy nhat mot he so va mot so mu. Vi du: dt1 = x^2 ; dt2 = 5x^1;
    			        // Thi thuc hien them vao cuoi he so va so mu cua da thuc 2.
    					kq = ThemCuoi(kq, p2.hs, p2.sm);
    				}
    			}
    			else {
    				kq = ThemCuoi(kq, p2.hs, p2.sm);
    				p2 = p2.next;
    				if (p2 == null && p1 != null) {
    					// Neu da thuc chi co duy nhat mot he so va mot so mu. Vi du: dt1 = x^1 ; dt2 = 5x^2;
    			        // Thi thuc hien them vao cuoi he so va so mu cua da thuc 1.
    					kq = ThemCuoi(kq, p1.hs, p1.sm);
    				}
    			}
    		}
    	}
    	return kq;
    }
    
 // Ham tru 2 da thuc
    public Da_Thuc Tru2DaThuc(Da_Thuc p1, Da_Thuc p2) {
    	if (p1 == null || p2 == null) {
    		System.out.println("Ko the thuc hien phep cong da thuc khi"
    				+ " 1 trong 2 da thuc la null\n");
    		return null;
    	}
    	while (p1 != null && p2 != null) {
    		if (p1.sm == p2.sm) {
    			kq = ThemCuoi(kq, p1.hs - p2.hs, p1.sm);
    			p1 = p1.next;
    			p2 = p2.next;
    		}
    		else {
    			if (p1.sm > p2.sm) {
    				kq = ThemCuoi(kq, p1.hs, p1.sm);
    				p1 = p1.next;
    				if (p1 == null && p2 != null) {
    					// Neu da thuc chi co duy nhat mot he so va mot so mu. Vi du: dt1 = x^2 ; dt2 = 5x^1;
    			        // Thi thuc hien them vao cuoi he so va so mu cua da thuc 2.
    					kq = ThemCuoi(kq, p2.hs, p2.sm);
    				}
    			}
    			else {
    				kq = ThemCuoi(kq, p2.hs, p2.sm);
    				p2 = p2.next;
    				if (p2 == null && p1 != null) {
    					// Neu da thuc chi co duy nhat mot he so va mot so mu. Vi du: dt1 = x^1 ; dt2 = 5x^2;
    			        // Thi thuc hien them vao cuoi he so va so mu cua da thuc 1.
    					kq = ThemCuoi(kq, p1.hs, p1.sm);
    				}
    			}
    		}
    	}
    	return kq;
    }
    
    // Ham nhap da thuc
    public Da_Thuc Nhap(Da_Thuc p) {
    	int hs, sm;
    	char chon;
    	Scanner scanner = new Scanner(System.in);
    	do {
    		System.out.print("Nhap he so: ");
    		hs = scanner.nextInt();
    		System.out.print("Nhap so mu: ");
    		sm = scanner.nextInt();
    		p = ThemCuoi(p, hs, sm);
    		System.out.print("Ban muon nhap tiep khong ? (c/k) ");
    		chon = scanner.next().charAt(0);
    	} while (chon == 'c');
    	return p;
    }
    
    String DauHeSo(int somu) {
    	String temp = "";
    	if (somu > 1) {
    		temp += " + ";
    	}
    	else {
    		temp += " ";
    	}
    	return temp;
    }
    
    // Ham in da thuc
    public void HienThi(Da_Thuc p) {
    	Da_Thuc q = p;
    	System.out.print(" ==> ");
    	while (q != null) {
    		if (q.hs > 0) {
    			System.out.print(q.hs + "x^" + q.sm + DauHeSo(q.sm));
    		}
    		else {
    			System.out.print(q.hs + "x^" + q.sm + " ");
	        }
    		q = q.next;
    	}
    }

	public static void main(String[] args) {
	    Tinh_Da_Thuc dt = new Tinh_Da_Thuc();
	    Da_Thuc dt1 = null;
		Da_Thuc dt2 = null;
		System.out.print("Da thuc 1:\n");
		dt1 = dt.Nhap(dt1);
		System.out.print("\nDa thuc 2:\n");
		dt2 = dt.Nhap(dt2);
		System.out.print("\nDay la da thuc 1: ");
		dt.HienThi(dt1);
		System.out.print("\nDay la da thuc 2: ");
		dt.HienThi(dt2);
		System.out.print("\nTong 2 da thuc la: ");
		Da_Thuc dtt = dt.Cong2DaThuc(dt1, dt2);
		dt.HienThi(dtt);
		System.out.print("\nHieu 2 da thuc la: ");
		Da_Thuc dth = dt.Tru2DaThuc(dt1, dt2);
		dt.HienThi(dth);
	}
}