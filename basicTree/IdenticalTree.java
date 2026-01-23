package tree;

import java.util.ArrayList;
import java.util.List;

public class IdenticalTree {
    public static void main(String[] args) {
        //Node node= new Node(1);
        Node root= new Node(1);
        root.left= new Node(2);
        root.left.left= new Node(3);
        root.left.right= new Node(4);
        root.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);


        Node root1= new Node(1);
        root1.left= new Node(2);
        root1.left.left= new Node(3);
        root1.left.right= new Node(4);
        root1.right= new Node(5);
        root1.right.left= new Node(6);
        root1.right.right= new Node(7);

         //res =checkIdentical(root);
        System.out.println("Two tree is identical : "+checkIdentical(root,root1));

    }

    private static boolean checkIdentical(Node root, Node root1) {
        if(root==null || root1==null){
            return (root==root1);
        }
        return (root.val==root1.val) && checkIdentical(root.left,root1.left) && checkIdentical(root.right,root1.right);
    }
}
