import java.util.ArrayList;
import java.util.List;

public class Graph<T> {
	
	 private List<Vertex<T>> vertices;
	 
	 public Graph() {
		 vertices = new ArrayList<Vertex<T>>();
	 }
	  	 
	 public void addVertex(Vertex<T> vertex){
		 if (!vertices.contains(vertex)) {
			 vertices.add(vertex);
		 }
	 }
	 
	 public void addEdge(Vertex<T> vertex_1, Vertex<T> vertex_2){
		 vertex_1.getNeighbours().add(vertex_2);
		 vertex_2.getNeighbours().add(vertex_1);
	 }
	 
	 public boolean containsEdge(Vertex<T> vertex_1, Vertex<T> vertex_2){
		 if(vertex_1.getNeighbours().contains(vertex_2)){
			 return true;
		 } else{
			 return false;
		 }
	 }
	 
	 public void hasPath(Vertex<T> start, Vertex<T> end){	
		 if(start.getNeighbours().contains(end)){
			 System.out.println("There is a path");			 
		 } else{
			 for(int i = 0; i < start.getNeighbours().size(); i++){
				 Vertex<T> temp = start.getNeighbours().poll();
				 hasPath(temp, end);
			 }
			 return;
		 }
	 }
}