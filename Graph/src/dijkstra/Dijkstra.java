package dijkstra;

import java.util.PriorityQueue;

public class Dijkstra {
    
	public void show(Vertex vertex) {
		vertex.setKc(0);
		PriorityQueue<Vertex> q = new PriorityQueue<>();
		q.add(vertex);
		vertex.setVisited(true);
		
		while (!q.isEmpty()) {
			Vertex actual = q.poll();
			for (Edge e : actual.getL()) {
				Vertex v = e.getTargetVertex();
				if (v.isVisited() == false) {
					int newKc = actual.getKc() + e.getValue();
					if (newKc < v.getKc()) {
						q.remove(v);
						v.setKc(newKc);
						v.setV(actual);
						q.add(v);
					}
				}
			}
			actual.setVisited(true);
		}
	}
	
	public static void main(String[] args) {
		Vertex vA = new Vertex("A");
        Vertex vB = new Vertex("B");
        Vertex vC = new Vertex("C");
        Vertex vD = new Vertex("D");
        Vertex vE = new Vertex("E");

        vA.addNeighbour(new Edge(3, vA, vC));
        vA.addNeighbour(new Edge(5, vA, vB));
        vC.addNeighbour(new Edge(2, vC, vB));
        vC.addNeighbour(new Edge(6, vC, vE));
        vC.addNeighbour(new Edge(5, vC, vD));
        vB.addNeighbour(new Edge(4, vB, vC));
        vB.addNeighbour(new Edge(3, vB, vD));
        vB.addNeighbour(new Edge(4, vB, vE));
        vE.addNeighbour(new Edge(2, vE, vD));
        
        Dijkstra d = new Dijkstra();
        d.show(vA);
        System.out.println("Khoang cach ngan nhat tu A -> B: " + vB.getKc());
        System.out.println("Khoang cach ngan nhat tu A -> C: " + vC.getKc());
        System.out.println("Khoang cach ngan nhat tu A -> D: " + vD.getKc());
        System.out.println("Khoang cach ngan nhat tu A -> E: " + vE.getKc());
	}
}