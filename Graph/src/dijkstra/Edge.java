package dijkstra;

public class Edge {
    int value;
    Vertex startVertex;
    Vertex targetVertex;
    
	public Edge(int value, Vertex startVertex, Vertex targetVertex) {
		this.value = value;
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}
}