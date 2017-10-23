package binarysearchtree;

public class App {

    public static void main(String[] args){

        int[] nums = {40, 70, 50, 80, 20, 30, 10, 90, 60, 75};
        BinarySearchTree tree = new BinarySearchTree(60);
        for(int i = 0; i < nums.length; i++){
            tree.insert(nums[i]);
        }

        tree.inOrderTraversal(tree.root);
        line();
        tree.preOrderTraversal(tree.root);
        line();
        tree.postOrderTraversal(tree.root);
        line();
    }

    static void line(){
        System.out.println();
    }
}
