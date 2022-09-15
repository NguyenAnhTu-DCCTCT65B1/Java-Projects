package java_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

/*
 * 1. Map
 * - La tap cac cap key-value de luu tru va truy xuat data
 * - Khong the co cac key trung lap nhung value co the trung lap
 * - 1 key duoc lien ket toi da voi 1 value
 * - Moi cap key-value duoc goi la entry
 * 
 * NOTE: Entry la 1 interface con cua Map => cung cap methods de truy cap cac key-value
 * 
 * 2. HashMap
 * - La 1 lop extends lop AbstractMap va implement tu Map
 * - Luu tru cac phan tu duoi dang key-value 
 * => Key va value la kieu du lieu bat ki
 * 
 * DAC DIEM:
 * - Chua cac key duy nhat
 * - Chi co the co 1 key la null va co the co nhieu null value
 * - Khong dong bo
 * - Khong duy tri thu tu
 * 
 * CACH HOAT DONG CUA HASHMAP:
 * - HashMap hoat dong dua tren nguyen li cua viec bam du lieu
 * - Map.Entry interface la noi dai dien chua cac entry (cap key-value) cua Map
 * - Phuong thuc hashCode(): HashMap cung cap hoat dong put(key, value) de luu tru va get(key) de lay ra gia tri tu HashMap.
 *   Khi pt put duoc goi, HashMap se goi pt hashCode() tu doi tuong key de tinh toan gia tri hash de tim den key tuong ung 
 *   va luu tru doi tuong Entry trong do. Khi get() duoc su dung de lay ra value, 1 lan nua doi tuong key duoc dung de tinh 
 *   toan ra hash, tu do tim duoc noi chua data cua key do
 * - Pt equals(): pt nay duoc dung de so sanh 2 object. Trong truong hop cua HashMap la ss 2 key, ngoai ra pt nay con xu li 
 *   hashing collision - xung dot bam khi 2 phan du lieu trong bang bam chi se cung 1 hash value
 * 
 * DUNG HASHMAP VI: Toc do thao tac data nhanh 
 * 
 * DUNG HASHMAP KHI khong can duy tri thu tu chen
 * 
 * 3. LinkedHashMap
 * - Ke thua lop HashMap
 * - Iplement tu Map
 * 
 * DAC DIEM:
 * - Luu tru data duoi dang cap key-value
 * - Chua cac key duy nhat
 * - Chi co the co 1 key la null va co the co nhieu null value
 * - Khong dong bo
 * - Duy tri thu tu 
 * 
 * DUNG LINKEDHASHMAP VI: De dang them, sua, xoa cac phan tu
 * 
 * DUNG LINKEDHASHMAP KHI can duy tri thu tu them vao
 * 
 * 4. TreeMap
 * - Ke thua lop AbstractMap va implement tu NavigableMap Interface (NavigableMap->SortedMap->Map)
 * - Luu tru phan tu duoi dang key-value
 * 
 * DAC DIEM:
 * - Chua cac key duy nhat
 * - Khong cho phep null key nhung co the co nhieu null value
 * - Duy tri cac phan tu theo thu tu tang dan
 * - Khong dong bo
 * 
 * DUNG TREEMAP VI: Thoi gian truy xuat nhanh
 * 
 * DUNG TREEMAP KHI can sap xep 1 Map
 * 
 * 5. EnumMap
 * - La 1 cai dat chuyen biet de su dung voi cac enum keys
 * - Extends tu enum va abstractMap
 * 
 * DUNG ENUMMAP VI: co hieu suat tot hon
 * 
 * DUNG ENUMMAP KHI biet truoc duoc gioi han cua key
 * 
 * 6. HashTable
 * - Ke thua lop Dictionary va implement tu Map
 * - La 1 mang cua list. Moi list duoc goi la 1 nhom. Vi tri cua nhom duoc xac dinh bang cach goi pt hashCode()
 * => Luu tru duoi dang cap key-value
 * - Thuc hien cac ham bam
 * 
 * DAC DIEM:
 * - Chua cac key duy nhat
 * - Khong cho phep null key or value
 * - Duoc dong bo
 * 
 * DUNG HASHTABLE VI: Day la luong an toan nen co the chia se den nhieu luong khac
 * 
 * DUNG HASHTABLE KHI thao tac tren 1 mang
 */

class HangHoa {
	private String name;
	private String HSD;
	private String address;
	
	public HangHoa(String name, String hSD, String address) {
		this.name = name;
		HSD = hSD;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHSD() {
		return HSD;
	}

	public void setHSD(String hSD) {
		HSD = hSD;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "HangHoa [name = " + name + ", HSD = " + HSD + ", address = " + address + "]";
	}
}

public class Map_Interface {
	
	public void HashMap() {
		System.out.println("HASHMAP:");
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1212, "Tuan");
		hs.put(1213, "Thai");
		hs.put(1334, "Thinh");
		hs.put(1216, "Tien");
		System.out.println(hs);
		System.out.println("\nSau khi xoa:");
		hs.remove(1334);
		System.out.println(hs);
		
		System.out.println("\nSau khi cap nhat:");
		hs.put(1216, "Duy");
		System.out.println(hs);
		
		hs.compute(1212, (key, value) -> value.concat(" Thanh"));
		System.out.println("New Map: " + hs);
	}
	
	public void TreeMap() {
		System.out.println("\nTREEMAP:");
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		m.put(2, "Java");
		m.put(4, "C++");
		m.put(1, "PHP");
		m.put(3, "Python");
		System.out.println(m);
	}
	
	public void HashTable() {
		System.out.println("\nHASHTABLE:");
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        // add elements to hashtable
        hashtable.put(3, "C++");
        hashtable.put(1, "Java");
        hashtable.put(2, "PHP");
        hashtable.put(4, "Python");
        System.out.println(hashtable);
        hashtable.remove(2);
        
        System.out.println("After remove:");
        System.out.println(hashtable);
	}
	
	public static void show(LinkedHashMap<Integer, HangHoa> lkh) {
		Set<Integer> s = lkh.keySet();
		for (Integer key : s) {
			System.out.println(key + " - " + lkh.get(key));
		}
	}
	
	public static void main(String[] args) {
        Map_Interface m = new Map_Interface();
        m.HashMap();
        m.TreeMap();
        m.HashTable();
        m.hashCode();
        
        System.out.println("\nLINKEDHASHMAP:");
        LinkedHashMap<Integer, HangHoa> l = new LinkedHashMap<Integer, HangHoa>();
        l.put(1, new HangHoa("Vai", "31-12-2022", "Bac Giang"));
        l.put(null, new HangHoa("Nho", "31-12-2022", "Ninh Thuan"));
        l.put(3, null);
        l.put(4, new HangHoa("Na", "31-12-2022", "Caribe"));
        show(l);
	}
}