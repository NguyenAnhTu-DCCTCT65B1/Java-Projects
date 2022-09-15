package java_note;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	abstract void Draw();
}

class HCN extends Shape {
	void Draw() {
		System.out.println("Ve HCN");
	}
}

class HV extends Shape {
	void Draw() {
		System.out.println("Ve HV");
	}
}

public class VD2 {
	
	public void DrawShape(List<? extends Shape> l) {
		for (Shape s : l) {
			s.Draw();
		}
	}
	
	public static void main(String[] args) {
        List<HV> list = new ArrayList<HV>();
        List<HCN> li = new ArrayList<HCN>();
        VD2 vd = new VD2();
        li.add(new HCN());
        list.add(new HV());
        vd.DrawShape(list);
        vd.DrawShape(li);
	}
}