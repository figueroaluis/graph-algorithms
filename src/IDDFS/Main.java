package IDDFS;

public class Main {
    public static void main(String[] args){

        Node n0 = new Node("A");
        Node n1 = new Node("B");
        Node n2 = new Node("C");
        Node n3 = new Node("D");
        Node n4 = new Node("E");

        n0.addNeighbor(n1);
        n0.addNeighbor(n2);
        n1.addNeighbor(n3);
        n3.addNeighbor(n4);

        Algorithm algorithm = new Algorithm(n4);
        algorithm.runDeepeningSearch(n0);


    }
}
