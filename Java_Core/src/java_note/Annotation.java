package java_note;

import java.util.List;
import javax.annotation.processing.Generated;
import java.util.Date;

/* 
 * 1. KN
 * - La 1 chu thich hoac 1 dang sieu du lieu
 * - Duoc dung de cung cap thong tin du lieu cho ma nguon Java
 * => Khong anh huong den hoat dong cua code ma chung chu thich
 * - Cac Annotation su dung trong ma nguon se duoc bien dich thanh byte code va su dung ki thuat
     phan chieu (Reflection) de truy van thong tin sieu du lieu va dua ra hanh dong thich hop
 * - Co the chu thich class, method, variable, package va cac tham so 
 * - 2 loai:
 * + Cac Annotation co san
 * + Annotation do nguoi dung tu dinh nghia
 * 
 * 2. Cac Annotation duoc tich hop san
 * a. Su dung truc tiep trong code
 * - @Override: duoc su dung cho cac method => ghi de 1 method trong lop cha
 * - @Deprecated: duoc su dung de danh dau 1 doi tuong ( class, method ) va chi dan rang no khong nen su dung nua
 * - @SuppressWarnings: duoc su dung de ngan chan cac canh bao   
 * + @SuppressWarnings(“deprecation”) de thong bao trinh bien dich khong canh bao viec su dung method co su dung @Deprecated
 * + @SuppressWarnings(“unchecked”) de thong bao trinh bien dich khong canh bao viec su dung 1 ep kieu khong an toan
 * + @SuppressWarnings(“raw types”) de thong bao trinh bien dich khong canh bao loi trong khai bao kieu du lieu
 * - @Generated: Danh dau ma nguon da duoc tao, co the phan biet ma do nguoi dung viet voi ma duoc tao trong 1 file 
 * - @FunctionalInterface: khong the co nhieu hon 1 abstract method
 * - @Native: cho biet cac TT la 1 hang so co the duoc tham chieu tu ma goc
 * 
 * b. Su dung trong Annotation khac
 * - @Target: chu thich pham vi su dung cua 1 Annotation 
 * - @Retention: chu thich muc do ton tai cua 1 Annotation
 * + RetentionPolicy.SOURCE: Cac chu thich duoc luu giu se bi huy trong thoi gian chay
 * + RetentionPolicy.CLASS: Cac chu thich duoc ghi lai trong tep .class nhung bi loai bo trong thoi gian chay 
 * + RetentionPolicy.RUNTIME: Cac chu thich duoc giu lai trong thoi gian chay va co the duoc truy cap trong thoi gian chay
 * - @Inherited: chi ra chu thich co the duoc ke thua tu lop cha
 * - @Documented: danh dau chu thich de dua vao tai lieu
 * 
 * 3. Annotation tu dinh nghia
 * - Kha giong 1 interface, de khai bao 1 Annotation => dung @interface
 * - Co the co or khong co phan tu
 * - DAC DIEM:
 * + Khong co than ham
 * + Khong co tham so
 * + Khai bao tra ve phai la 1 kieu du lieu cu the 
 * + Co the co gia tri mac dinh
 */

//  Cac Annotation duoc tich hop san su dung truc tiep trong code
@FunctionalInterface
interface Hello {
	int value();
}

@Generated(value = "VD", date = "2017-07-04T12: 08: 56.235-0700")
class Test {
	@SuppressWarnings("rawtypes")
    private List l;
    @SuppressWarnings("unchecked")
    public void addVersion(String version) {
        l.add(version);
    }
}

class A {
	public void method_1() {
		System.out.println("Hello!!!");
	}
}

class B extends A {
	@Override
	public void method_1() {
		System.out.println("Hi...");
	}
	
	@Deprecated
	public void method_2() {
		System.out.println("Goodbye!!!");
	}
	
	@SuppressWarnings("deprecation")
	public void Date() {
		Date d = new Date(2020, 05, 20);
		d.getDate();
	}
}

public class Annotation {

	public static void main(String[] args) {
		B b = new B();
		b.method_1();
		b.method_2();
	}
}