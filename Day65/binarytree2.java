import java.net.PortUnreachableException;

import BuildBinaryTree.Node;

public class BuildBinaryTree {
   static class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
   }
static class BinaryTree{
    static int idx = -1;
    public Node buildTree(int Node[]){
        idx++;
        if(Node[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree()

    }



}






}
