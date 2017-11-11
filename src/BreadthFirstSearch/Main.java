package BreadthFirstSearch;

public class Main {
    public static void main(String[] args){

        BFS bfs = new BFS();

        // set vertices
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex6 = new Vertex(6);
        Vertex vertex7 = new Vertex(7);
        Vertex vertex9 = new Vertex(9);
        Vertex vertex11 = new Vertex(11);

        // set neighbors to vertices
        vertex6.addNeighborVertex(vertex3);
        vertex6.addNeighborVertex(vertex9);
        vertex3.addNeighborVertex(vertex2);
        vertex3.addNeighborVertex(vertex4);
        vertex2.addNeighborVertex(vertex1);
        vertex9.addNeighborVertex(vertex7);
        vertex9.addNeighborVertex(vertex11);

        bfs.bfs(vertex6);

    }
}
