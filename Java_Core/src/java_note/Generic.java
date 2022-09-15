package java_note;

/*
 * 1. KN
 * - La 1 cach de xac dinh cac kieu cu the cho class va method trong ngu canh khac nhau
 * - Dung Generic khi muon truu tuong hoa kieu du lieu cho 1 class, method
 * => Nham su dung class or method cho nhieu kieu du lieu
 * 
 * 2. Generic class
 * - La 1 lop co the tham chieu bat ki kieu doi tuong nao
 * - Quy uoc dat ten tham so:
 * + T - Type: Kieu du lieu bat ki nhu lop Integer, String, Double, ...
 * + E - Element: Kieu phan tu duoc su dung trong Collection
 * + K - Key
 * + V - Value
 * + N - Number: Kieu so nhu Integer, Double, ...
 * 
 * 3. Ki tu dai dien trong Generic
 * - ?: la phan tu ki tu dai dien => su dung cho bat ki kieu nao
 * + Collection<?>: mo ta 1 tap hop chap nhan tat ca cac loai doi so => chua moi kieu doi tuong
 * + List<? extends Number>: mo ta 1 danh sach, noi ma cac phan tu la kieu Number or kieu con cua Number
 * + Comparator<? super String>: mo ta 1 bo so sanh ma thong so phai la String or cha cua String 
 */

class MyGeneric<K, V> {	
	private K key;
	private V value;
	
 	public MyGeneric(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

class Book extends MyGeneric<String, String> {
    public Book(String key, String value) {
		super(key, value);
	}
}

public class Generic {
	
	public static void main(String[] args) {
        Book b = new Book("Xin", "Chao");
        System.out.println(b.getKey() + " " + b.getValue());
	}
}