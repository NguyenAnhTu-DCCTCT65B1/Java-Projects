import java.util.Locale;
import java.util.Scanner;

public class QuanLiSinhVien {
	
	private int number;
	private Student head;
	
	public QuanLiSinhVien() {
		head = null;
		number = 0;
	}
	
	public void ThemSinhVien() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien: ");
		number = scanner.nextInt();
		int stt = 0;
		for (int i = 0; i < number; i++) {
			stt = i + 1;
			Student p = new Student();
			System.out.print("\nThong tin sinh vien " + stt);
			System.out.print("\nMa sinh vien: ");
			p.id = scanner.next();
			System.out.print("Ten sinh vien: ");
			scanner.nextLine();
			p.name = scanner.nextLine();
			System.out.print("Date of birth: ");
			p.dateofbirth = scanner.next();
			System.out.print("Tuoi: ");
			p.age = scanner.nextInt();
			System.out.print("Diem trung binh: ");
			scanner.useLocale(Locale.UK);
			p.point = scanner.nextFloat();
			// Them sinh vien vao dau ds
			if (head == null) {
				head = p;
				p.next = head;
			}
			else {
				Student q = head;
				do {
					q = q.next;
				} while (q.next != head);
				q.next = p;
				p.next = head;
				head = p;
			}
		}
	}
	
	public int RemoveStudent(int pos) {
		if (pos - 1 == 0) {
			Student p = head;
			Student q = head;
			do {
				p = p.next;
			} while (p.next != head);
			head = q.next;
			q = null;
			p.next = head;
			return pos;
		}
		else {
			Student p = head;
			Student q = head;
			for (int i = 0; i < pos - 1; i++) {
				q = p;
				p = p.next;
			}
			q.next = p.next;
			p = null;
			return pos;
		}
	}
	
	public void CheckAgeStudent(int age) {
		Student p = head;
		int count = 0;
		do {
			if (p.age > age) {
				count++;
			}
			p = p.next;
		} while (p != head);
		if (count > 0) {
			System.out.print("\nTim thay " + count + " sinh vien co tuoi lon hon " + age + "\n");
		}
		else {
			System.out.print("\nKhong tim thay sinh vien nao co tuoi lon hon 18\n");
		}
	}
	
	void Swap(Student q1, Student q2) {
		Student temp = new Student();
		temp.id = q1.id; q1.id = q2.id; q2.id = temp.id;
		temp.name = q1.name; q1.name = q2.name; q2.name = temp.name;
		temp.dateofbirth = q1.dateofbirth; q1.dateofbirth = q2.dateofbirth; q2.dateofbirth = temp.dateofbirth;
		temp.age = q1.age; q1.age = q2.age; q2.age = temp.age;
		temp.point = q1.point; q1.point = q2.point; q2.point = temp.point;
	}

	public void SapXep() {
		Student p = head;
		Student q;
		do {
			q = p.next;
			while (q != head) {
				if (q.point < p.point) {
					Swap(p, q);
				}
				q = q.next;
			}
			p = p.next;
		} while (p != head);
	}
	
	public void Display() {
		Student p = head;
		System.out.print("Ma SV" + "\t\t");
		System.out.print("Ten SV" + "\t\t");
		System.out.print("DateOfBirth" + "\t\t");
		System.out.print("Tuoi" + "\t\t");
		System.out.print("Diem trung binh\n");
		do {
			System.out.print(p.id + "\t\t");
			System.out.print(p.name + "\t\t");
			System.out.print(p.dateofbirth + "\t\t\t");
			System.out.print(p.age + "\t\t");
			System.out.print(p.point + "\n");
			p = p.next;
		} while (p != head);
	}

	public static void main(String[] args) {
		QuanLiSinhVien sv = new QuanLiSinhVien();
		sv.ThemSinhVien();
		System.out.println("\nDanh sach sinh vien sau khi nhap:");
		sv.Display();
		sv.CheckAgeStudent(18);
		sv.SapXep();
		System.out.println("\nDanh sach sinh vien sap xep tang dan theo diem la:");
		sv.Display();
		System.out.println("\nDanh sach sinh vien sau khi xoa: " + sv.RemoveStudent(1));
		sv.Display();
	}
}