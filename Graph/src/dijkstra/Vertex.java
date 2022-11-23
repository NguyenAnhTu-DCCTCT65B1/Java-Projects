package dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
    
    String name;
    boolean isVisited;
    List<Edge> l;
    int kc = Integer.MAX_VALUE;
    Vertex v;

	public Vertex(String name) {
		this.name = name;
		this.l = new ArrayList<Edge>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return isVisited;
	}

    public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public List<Edge> getL() {
		return l;
	}

	public void setL(List<Edge> l) {
		this.l = l;
	}

	public int getKc() {
		return kc;
	}

	public void setKc(int kc) {
		this.kc = kc;
	}

	public Vertex getV() {
		return v;
	}

	public void setV(Vertex v) {
		this.v = v;
	}
	
	public void addNeighbour(Edge edge) {
        this.l.add(edge);
    }

	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
    public int compareTo(Vertex otherV) {
        return Integer.compare(this.kc, otherV.getKc());
    }
}