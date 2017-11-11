package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Vertex> stack;

    public DFS(){
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> vertexList){
        for(Vertex vertex : vertexList){
            if(!vertex.isVisited()){
                vertex.setVisited(true);
                dfsRecursive(vertex);
            }
        }
    }

    // in this case, the operating system will decide to use a stack in the lowest level
    private void dfsRecursive(Vertex v){

        System.out.print(v + " ");

        for(Vertex vertex : v.getNeighborList()){
            if(!vertex.isVisited()){
                vertex.setVisited(true);
                dfsRecursive(vertex);
            }
        }
    }

    private void dfsWithStack(Vertex rootVertex){
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);

        while(!stack.isEmpty()){
            Vertex actualVertex = this.stack.pop();
            System.out.print(actualVertex + " ");

            for(Vertex vertex : actualVertex.getNeighborList()){
                if(!vertex.isVisited()){
                    vertex.setVisited(true);
                    this.stack.push(vertex);
                }
            }
        }
    }

}
