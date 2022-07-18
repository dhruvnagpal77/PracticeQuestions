package Maximum_Depth_of_Binary_Tree_leetcode;

public class Main {
    public static void main(String args[]) {
        Solution obj = new Solution();
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(3);
        bst.insert(9);
        bst.insert(20);
        bst.insert(15);
        bst.insert(7);
        bst.insert(17);
        int output = obj.maxDepth(bst.getRoot());
        System.out.println(output);
    }
}