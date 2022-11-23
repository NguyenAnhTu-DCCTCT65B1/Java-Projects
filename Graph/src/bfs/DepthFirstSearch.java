package bfs;

/*
 * 2. Do thi co huong
 * - Dinh (vertices) 
 * - Canh (edges)
 * - BFS (Depth first search - duyet theo chieu dai)
 * => Nguyen li hoat dong: Dua vao STACK
 * 
 * - Pseudo code:   
 * dfs(node): 
 * set node to be visited
 * for n neighbor of node
 *     if n is not already visited
 *   	   dfs(n)
 */

public class DepthFirstSearch {
    
	public void dfs(Vertex vertex) {
		vertex.setVisited(true);
		System.out.println(vertex);
		for (Vertex v : vertex.getNeighborsList()) {
			if (v.isVisited() == false) {
				dfs(v);
			}
		}
	}

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
		
		DepthFirstSearch dfs = new DepthFirstSearch();
		dfs.dfs(a);
	}
}