package thread;

/* Thread: la 1 tien trinh con => don vi nho nhat cua tien trinh
 * 
 * 1. KN 
 * - Da luong la 1 tien trinh thuc hien nhieu luong dong thoi
 * - 1 tien trinh co 1 moi truong thuc hien khep kin, moi tien trinh deu co khong gian bo nho rieng
 * => Da tien trinh (multiprocessing) va da luong duoc su dung de tao ra he thong da nhiem (multitasking)
 * NOTE: Su dung da luong nhieu hon vi cac luong chia se 1 vung bo nho chung, chuyen doi ngu canh giua cac luong mat it thoi gian hon
 * - Uu diem:
 * + No khong chan nguoi su dung vi cac luong la doc lap va co the thuc hien nhieu cong viec cung 1 luc
 * + Co the thuc hien nhieu hoat dong voi nhau de tiet kiem thoi gian
 * + Luong la doc lap => no khong anh huong den luong khac neu ngoai le xay ra trong 1 luong duy nhat
 * 
 * 2. Multitasking
 * - La qua trinh thuc hien nhieu nhiem vu cung 1 luc
 * - Da nhiem co the dat duoc bang 2 cach:
 * + Da nhiem dua tren tien trinh
 *   Moi tien trinh co dia chi rieng trong bo nho
 *   Tien trinh la nang
 *   Su giao tiep giua cac tien trinh co chi phi cao
 *   Chuyen doi tu tien trinh nay sang tien trinh khac doi hoi thoi gian de dang ki viec luu va tai,
 *   cac ban do bo nho, cac danh sach cap nhat
 * + Da nhiem dua tren luong
 *   Cac luong chia se khong gian dia chi o nho giong nhau
 *   Luong la nhe
 *   Su giao tiep giua cac luong co chi phi thap
 * 
 * 3. Cac trang thai cua thread
 * - New: thread o trang thai new neu tao 1 instance cua lop Thread truoc khi goi pt start()
 * - Runnable: thread o trang thai runnable sau khi goi pt start(), nhung trinh len lich cua thread khong chon no la thread dang chay
 * - Blocked: 
 * - Terminated: thread o trang thai nay or dead khi pt run() bi thoat
 * 
 * 4. Lop Thread
 * a. Methods
 * - checkAccess(): kiem tra luong hien dang chay co quyen sua luong duoc chi dinh hay khong
 * - run(): duoc su dung de thuc hien hanh dong cua 1 thread
 * - start(): bat dau thuc hien thread. JVM goi pt run() tren thread
 * - sleep(long millis): lam cho thread hien tai tam ngung thuc thi cho so mili giay quy dinh
 * - join(): doi cho 1 thread chet
 * - join(long millis ): doi cho 1 thread chet voi so mili giay quy dinh
 * - getPriority(): Tra ve muc do uu tien cua thread
 * - setPriority(int newPriority): Thay doi muc do uu tien cua thread
 * - setName(String name): Thay doi ten cua thread
 * - currentThread(): Tra ve tham chieu cua thread dang duoc thi hanh
 * - getState(): Tra ve trang thai cua thread
 * - isAlive(): Kiem tra neu thread con song
 * - yield(): Lam cho cac doi tuong thread dang thuc thi de tam thoi tam dung va cho phep cac thread khac de thuc thi
 * - isDaemon(): Kiem tra neu thread la 1 luong hiem
 * - setDaemon(boolean b): danh dau thread la luong hiem hoac luong nguoi dung
 * - interrupt(): Ngat thread
 * - isInterrupted(): Kiem tra neu thread da bi ngat
 * - interrupted(): Kiem tra neu thread hien tai da bi ngat
 * 
 * b. Runnable interface
 * - Duoc cai dat boi bat ki lop nao ma the hien cua lop do se duoc thuc thi boi thread
 * - Chi co 1 pt run()
 * 
 * 5. Thread scheduler
 * - Co nhiem vu quyet dinh thread nao nen duoc chay
 * - Chi co 1 thread duoc chay
 * - Su dung trong viec lap ke hoach uu tien hoac phan chia thoi gian de len lich cac luong
 * NOTE:
 * - Muc do uu tien: nam trong khoang tu 1 -> 10. Neu 1 thread co muc do uu tien cao hon => co co hoi tot hon duoc trinh len lich chon
 * - Thoi gian den: luong nao den truoc se duoc chon truoc
 */

class TestRunnable implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }
}

public class Multithreading extends Thread {
    
	public void run() {
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		Multithreading m = new Multithreading();
		m.start();
		System.out.println("Name: " + m.getName());
		TestRunnable t = new TestRunnable();
		Thread t1 = new Thread(t);
		t1.start();
	}
}