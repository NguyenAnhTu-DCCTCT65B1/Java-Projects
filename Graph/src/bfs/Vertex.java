package bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	String name;
	boolean isVisited;
	List<Vertex> neighborsList;
	
	public Vertex(String name) {
		this.name = name;
		this.neighborsList = new ArrayList<>();
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
	
	public List<Vertex> getNeighborsList() {
		return neighborsList;
	}
	
	public void addNeighbor(Vertex v) {
		this.neighborsList.add(v);
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}