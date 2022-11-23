package bfs;

import java.util.LinkedList;
import java.util.Queue;

/* 1. Do thi vo huong
 * - Dinh (vertices) 
 * - Canh (edges)
 * - Duyet do thi:
 *   + BFS (Breadth first search - duyet theo chieu rong)
 *   + Nguyen li hoat dong: Dua vao QUEUE

 * - Pseudo code:   
 *   bfs(vertex)
 *   Queue queue
 *   vertex set visited true
 *   queue.enqueue(vertex)
 *   while queue not empty
 *   	actual = queue.dequeue()
 *   	for v in actual neighbors
 *   		if v is not visited
 *   			v set visited true
 *   			queue.enqueue(v)
 */

class BFSAlgo {
	public void show(Vertex root) {
		Queue<Vertex> q = new LinkedList<Vertex>();
		root.setVisited(true);
		q.add(root);
		
		while (!q.isEmpty()) {
			Vertex actual = q.remove();
			System.out.println(actual);
			for (Vertex v : actual.getNeighborsList()) {
				if (v.isVisited == false) {
					v.setVisited(true);
					q.add(v);
				}
			}
		}
	}
}

public class BreathFirstSearch {

	public static void main(String[] args) {
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
	    Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		Vertex f = new Vertex("F");
		Vertex g = new Vertex("G");
		Vertex h = new Vertex("H");
		 
		a.addNeighbor(b); a.addNeighbor(f); a.addNeighbor(g);
		b.addNeighbor(a); b.addNeighbor(c); b.addNeighbor(d);
		c.addNeighbor(b);
		d.addNeighbor(b); d.addNeighbor(e);
		f.addNeighbor(a);
		g.addNeighbor(a); g.addNeighbor(h);
		h.addNeighbor(g);
		
		BFSAlgo bfs = new BFSAlgo();
		bfs.show(a);	
	}
}