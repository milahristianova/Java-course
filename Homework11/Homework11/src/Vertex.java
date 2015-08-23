import java.util.LinkedList;
import java.util.List;

public class Vertex<T> {

	private T data;
	private List<Vertex<T>> neighbours;
	
    public Vertex(T vertex) {
        this.data = vertex;
        this.neighbours = new LinkedList<Vertex<T>>();
    }
    
    public T getData() {
 		return data;
 	}

	public void setData(T vertex) {
 		this.data = vertex;
 	}

	public LinkedList<Vertex<T>> getNeighbours() {
		return (LinkedList<Vertex<T>>) neighbours;
	}

	public void setNeighbors(LinkedList<Vertex<T>> neighbours) {
		this.neighbours = neighbours;
	}

	public int compareTo(Vertex<T> object) {
        String temp_A = this.toString();
        String temp_B = object.toString();
         
        return temp_A.compareToIgnoreCase(temp_B);
    }
	
	@Override
	public String toString() {
	
		return "Vertex data: " + this.data;
	}
}