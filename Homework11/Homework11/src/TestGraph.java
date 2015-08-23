
public class TestGraph {
public static void main(String[] args) {
		
		Graph<String> graph = new Graph<String>();
		Vertex<String> node_1 = new Vertex<String>("node_1");
		Vertex<String> node_2 = new Vertex<String>("node_2");
		Vertex<String> node_3 = new Vertex<String>("node_3");
		Vertex<String> node_4 = new Vertex<String>("node_4");
		Vertex<String> node_5 = new Vertex<String>("node_5");
		Vertex<String> node_6 = new Vertex<String>("node_6");
			
		graph.addVertex(node_1);
		graph.addVertex(node_2);
		graph.addVertex(node_3);
		graph.addVertex(node_4);
		graph.addVertex(node_5);
		graph.addVertex(node_6);
		
		graph.addEdge(node_1, node_2);
		graph.addEdge(node_1, node_3);
		graph.addEdge(node_2, node_3);
		graph.addEdge(node_2, node_4);
		graph.addEdge(node_4, node_5);
		
		System.out.println("Vertices and their neighbours: ");
		System.out.print(node_1 + ", neighbours: ");
		System.out.println(node_1.getNeighbours());
		System.out.print(node_2 + ", neighbours: ");
		System.out.println(node_2.getNeighbours());
		System.out.print(node_3 + ", neighbours: ");
		System.out.println(node_3.getNeighbours());
		System.out.print(node_4 + ", neighbours: ");
		System.out.println(node_4.getNeighbours());
		System.out.print(node_5 + ", neighbours: ");
		System.out.println(node_5.getNeighbours());
		
		boolean result = graph.containsEdge(node_1, node_3);
		System.out.println("\n Is there edge between node_1 and node_3: " + result);
		boolean ressult = graph.containsEdge(node_1, node_5);
		System.out.println("Is there edge between node_1 and node_5: " + ressult);
		
		System.out.print("Is there path between node_1 and node_5: ");
		graph.hasPath(node_1, node_4);
		
		System.out.print("Is there path between node_1 and node_6: ");
		graph.hasPath(node_1, node_6);
		
	}

}

