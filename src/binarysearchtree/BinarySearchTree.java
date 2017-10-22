package binarysearchtree;

public class BinarySearchTree {

    class Node{
        int data;
        Node leftChild;
        Node rightChild;

        public Node(int data){
            this.data = data;
        }
    }

    Node root;

    public BinarySearchTree(){
        root = null;
    }

    public BinarySearchTree(int rootVal){
        root = new Node(rootVal);
    }

    public void insert(int data){
        Node newNode = new Node(data);

        place(newNode, root);
    }

    private void place(Node child, Node parent){
        if(child.data > parent.data)
            if(parent.rightChild == null)
                parent.rightChild = child;
            else
                place(child, parent.rightChild);
        else
        if(parent.leftChild == null)
            parent.leftChild = child;
        else
            place(child, parent.leftChild);
    }

    public Node find(int data){
        Node node = root;
        while(data != node.data)
            if(data > node.data)
                if(node.rightChild == null)
                    return null;
                else
                    node = node.rightChild;
            else
            if(node.leftChild == null)
                return null;
            else
                node = node.leftChild;

        return node;
    }


}
