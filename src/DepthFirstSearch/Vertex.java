package DepthFirstSearch;

import java.util.List;
import java.util.ArrayList;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> neighborList;

    public Vertex(String name){
        this.name = name;
        this.neighborList = new ArrayList<>();
    }

    public void addNeighbor(Vertex vertex){
        this.neighborList.add(vertex);
    }

    @Override
    public String toString(){
        return this.name;
    }

    // auto generated getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighborList() {
        return neighborList;
    }

    public void setNeighborList(List<Vertex> neighborList) {
        this.neighborList = neighborList;
    }
}
