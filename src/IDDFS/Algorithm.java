package IDDFS;

import java.util.Stack;

public class Algorithm {

    // this algorithm is going to look like a DFS, but we need to keep track of the depth level

    private Node targetVertex;
    private boolean isTargetFound;

    public Algorithm(Node targetVertex){
        this.targetVertex = targetVertex;
    }

    public void runDeepeningSearch(Node root){
        int depth = 0;

        while(!isTargetFound){
            System.out.println();
            dfs(root, depth);
            depth++;
        }
    }

    private void dfs(Node sourceVertex, int depthLevel){
        Stack<Node>  stack = new Stack<>();
        sourceVertex.setDepthLevel(0);
        stack.push(sourceVertex);

        while(!stack.isEmpty()){
            Node actualNode = stack.pop();
            System.out.print(actualNode + " ");

            if(actualNode.getName().equals(this.targetVertex.getName())){
                System.out.println(": Has been found");
                this.isTargetFound = true;
                return;
            }

            if(actualNode.getDepthLevel() >= depthLevel){
                continue;
            }

            for(Node node : actualNode.getAdjacenciesList()){
                node.setDepthLevel(actualNode.getDepthLevel()+1);
                stack.push(node);
            }
        }
    }
}
