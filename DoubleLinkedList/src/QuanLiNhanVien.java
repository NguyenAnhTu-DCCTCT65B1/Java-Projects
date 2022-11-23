import java.util.Scanner;

public class QuanLiNhanVien {
	
	private Staff head;
	private int number;
	
	public QuanLiNhanVien() {
		head = null;
		number = 0;
	}
	
	public void NhapNhanVien() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong nhan vien: ");
		number = scanner.nextInt();
		Staff tail = head;
		int stt = 0;
		for (int i = 0; i < number; i++) {
			stt = i + 1;
			Staff p = new Staff();
			System.out.print("\nThong tin nhan vien thu " + stt);
			System.out.print("\nMa nhan vien: ");
			p.id = scanner.next();
			System.out.print("Ten nhan vien: ");
			scanner.nextLine();
			p.name = scanner.nextLine();
			System.out.print("Date of birth: ");
			p.dateofbirth = scanner.next();
			System.out.print("Gioi tinh: ");
			p.gender = scanner.next();
			System.out.print("Luong: ");
			p.salary = scanner.nextInt();
			// Them vao vi tri dau tien trong ds
			/*if (head == nullptr) {
				head = p;
			}
			else {
	            p->next = head;
			    head->prev = p;
				head = p;
		    }*/
			// Them vao cuoi ds
			if (head == null) {
				head = p;
				tail = p;
			}
			else {
				tail.next = p;
				p.prev = tail;
				tail = p;
			}
		}
	}
	
	public int RemoveStaff(int pos) {
		if (pos - 1 == 0) {
			Staff p = head;
			head = head.next;
			p = null;
			head.prev = null;
			return pos;
		}
		else {
			Staff p = head;
			for (int i = 0; i < pos - 1; i++) {
				p = p.next;
			}
			p.prev.next = p.next;
			if (p.next != null) {
				p.next.prev = p.prev;
			}
			p = null;
			return pos;
		}
	}
	
	public void CheckSalary(int salary) {
		Staff p = head;
		int count = 0;
		while (p != null) {
			if (p.salary > salary) {
				count++;
			}
			p = p.next;
		}
		if (count > 0) {
			System.out.print("\nTim thay " + count + " nhan vien co luong lon hon " 
		    + salary + " VND" + "\n");
		}
		else {
			System.out.print("\nKhong tim thay nhan vien nao co luong lon hon 100.000 VND\n");
		}
	}
	
	void Swap(Staff q1, Staff q2) {
		Staff temp = new Staff();
		temp.id = q1.id; q1.id = q2.id; q2.id = temp.id;
		temp.name = q1.name; q1.name = q2.name; q2.name = temp.name;
		temp.dateofbirth = q1.dateofbirth; q1.dateofbirth = q2.dateofbirth; q2.dateofbirth = temp.dateofbirth;
		temp.gender = q1.gender; q1.gender = q2.gender; q2.gender = temp.gender;
		temp.salary = q1.salary; q1.salary = q2.salary; q2.salary = temp.salary;
	}
	
	public void SapXep() {
		Staff p = head;
		Staff q;
		while (p != null) {
			q = p.next;
			while (q != null) {
				if (q.salary > p.salary) {
					Swap(q, p);
				}
				q = q.next;
			}
			p = p.next;
		}
	}
	
	public void Display() {
		Staff p = head;
		System.out.print("Ma SV" + "\t\t");
		System.out.print("Ten SV" + "\t\t");
		System.out.print("DateOfBirth" + "\t\t");
		System.out.print("Gender" + "\t\t");
		System.out.print("Luong\n");
		while (p != null) {
			System.out.print(p.id + "\t\t");
			System.out.print(p.name + "\t\t");
			System.out.print(p.dateofbirth + "\t\t\t");
			System.out.print(p.gender + "\t\t");
			System.out.print(p.salary + "\n");
			p = p.next;
		}
	}

	public static void main(String[] args) {
        QuanLiNhanVien nv = new QuanLiNhanVien();
        nv.NhapNhanVien();
        System.out.println("\nDanh sach nhan vien sau khi nhap la:");
        nv.Display();
        nv.CheckSalary(100000);
        nv.SapXep();
        System.out.println("\nDanh sach nhan vien sau khi sap xep luong giam dan:");
        nv.Display();
        System.out.println("\nDanh sach nhan vien sau khi xoa: " + nv.RemoveStaff(2));
        nv.Display();
	}
}