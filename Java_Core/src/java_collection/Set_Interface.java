package java_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * 1. Set
 * - La 1 interface ke thua tu Collection 
 * - Khong the chua cac phan tu trung lap
 * - Chi co 1 phan tu null
 * 
 * 2. HashSet
 * - La 1 lop extends tu lop AbstractSet va la trien khai cua Set
 * - Su dung de tao 1 HashSet su dung bang bam de luu tru
 * 
 * DAC DIEM:
 * - Chi chua cac phan tu duy nhat
 * - Cho phep co phan tu null
 * - Luu tru cac phan tu bang cach dung 1 co che hash
 * - Khong dong bo
 * - Khong duy tri thu tu chen => Chen bang ma hash
 * 
 * CACH HASHSET HOAT DONG: Khi tao 1 object cua HashSet, 1 object cua HashMap lien ket voi no duoc tao ra. 
 *                         Object cua HashMap nay duoc su dung de luu tru cac phan tu them vao HashSet. 
 * 
 * DUNG HASHSET VI: Toc do thao tac data nhanh
 * 
 * DUNG HASHSET KHI list khong can duy tri thu tu chen 
 * 
 * 3. LinkedHashSet
 * - La 1 ban cai dat bang bam va danh sach lien ket cua Set interface
 * - Ke thua lop HashSet va implement tu Set interface
 * 
 * DAC DIEM:
 * - Chi chua cac phan tu duy nhat
 * - Cho phep phan tu null
 * - Duy tri thu tu chen
 * - Khong dong bo
 * 
 * DUNG LINKEDHASHSET VI: No cho phep lap qua cac phan tu theo thu tu duoc them vao
 * 
 * DUNG LINKEDHASHSET KHI list co duy tri thu tu chen
 * 
 * 4. TreeSet
 * - La lop implement tu Set interface va su dung cau truc cay de luu tru cac phan tu
 * - Cac object cua TreeSet duoc luu tru theo thu tu tang dan
 * 
 * DAC DIEM:
 * - Chi chua cac phan tu duy nhat
 * - Khong cho phep null phan tu
 * - Khong dong bo
 * 
 * NOTE: 
 * - Can cung cap Comparator khi tao TreeSet
 * - Neu khong co bat ki Comparator nao => cac phan tu duoc dat theo thu tu tang dan
 * - Cac phan tu trong TreeSet phai cung kieu, co the so sanh duoc voi nhau
 * 
 * DUNG TREESET VI: thoi gian truy xuat nhanh
 * 
 * DUNG TREESET KHI can sap xep 1 Set
 * 
 * 5. EnumSet
 * - Luu tru 1 tap hop cac phan tu kieu enum
 * - Ke thua lop Enum va AbstractSet, la implement tu Set
 * 
 * DAC DIEM:
 * - Tat ca cac value phai thuoc 1 kieu enum da dinh truoc
 * - Khong cho phep null phan tu
 * 
 * DUNG ENUMSET VI: co hieu suat cao
 * 
 * DUNG ENUMSET KHI biet truoc duoc gioi han cua value
 * 
 * 6. Tong ket
 * a. Giong nhau
 * - Khong cho phep cac phan tu trung lap
 * - Ca 3 khong dong bo
 * 
 * b. Khac nhau
 *         HashSet               |           LinkedHashSet           |                   TreeSet
 * - Su dung HashMap de luu tru  |   - Su dung LinkedHashMap de      | - Su dung TreeMap de luu tru cac phan tu
 * cac phan tu                   |   luu tru cac phan tu             |
 * - Khong duy tri thu tu chen   |   - Duy tri thu tu chen           | - Duy tri theo thu tu tang dan
 * - Cho phep null phan          |   - Cho phep null phan tu         | - Khong cho phep null phan tu
 * - Hieu suat tot hon           |   - Hieu suat cham hon HashSet    | - Hieu suat cham hon ca HashSet va LinkedHashSet
 * - Thao tac voi data la O(1)   |   - Thao tac voi data la O(1)     | - Thao tac voi data la O(log(n))
 * - Khong duy tri thu tu chen   |   - Duy tri thu tu chen           | - Can sap xep cac phan tu
 */

public class Set_Interface {
	
	public void HashSet() {
		System.out.println("HASHSET:");
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(17);
		hs.add(10);
		hs.add(4);
		System.out.println("Hash Code: " + hs.hashCode());
		System.out.println("Equals ? " + hs.equals(hs));
		
		HashSet<Integer> sh = new HashSet<Integer>();
		sh.addAll(hs);
		System.out.println("So phan tu cua sh: " + sh.size());
		System.out.println("Cac phan tu cua sh: " + sh);
		System.out.println("Sh co trong khong ? " + sh.isEmpty());
		
		sh.clear();
		System.out.println("Sau khi xoa cac phan tu:");
		System.out.println(sh);
	}
	
	public void LinkHashSet() {
		System.out.println("\nLinkHashSet:");
		LinkedHashSet<String> lks = new LinkedHashSet<String>();
		lks.add("Ha Noi");
		lks.add("TP.HCM");
		lks.add("Hai Phong");
		lks.add("Nam Dinh");
		System.out.println(lks);
	}

	public static void main(String[] args) {
		Set_Interface s = new Set_Interface();
		s.HashSet();
		s.LinkHashSet();
	}
}