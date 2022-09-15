package java_collection;

import java.util.EnumMap;
import java.util.Map;

enum Days {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

class TKB {
	private String MonHoc;

	public TKB(String monHoc) {
		MonHoc = monHoc;
	}

	public String getMonHoc() {
		return MonHoc;
	}

	public void setMonHoc(String monHoc) {
		MonHoc = monHoc;
	}

	@Override
	public String toString() {
		return "TKB [MonHoc = " + MonHoc + "]";
	}
}

public class VD2 {
	
	public static void main(String[] args) {
		EnumMap<Days, TKB> e = new EnumMap<Days, TKB>(Days.class);
		e.put(Days.Monday, new TKB("Toan-van-anh"));
		e.put(Days.Tuesday, new TKB("Toan-li-hoa"));
		e.put(Days.Wednesday, new TKB("Van-sinh-su"));
		e.put(Days.Thursday, new TKB("Dia-GDCD-anh"));
		e.put(Days.Friday, new TKB("GDQP-tin-TD"));
		e.put(Days.Saturday, new TKB("Toan-su-li"));
		e.put(Days.Sunday, null);
		
		System.out.println("TKB week days:");
		for (Map.Entry<Days, TKB> map : e.entrySet()) {
	        System.out.println(map.getKey() + " - " + map.getValue());
	    }
	}
}