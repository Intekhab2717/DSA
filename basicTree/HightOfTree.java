package tree;

import java.util.ArrayList;
import java.util.List;

public class HightOfTree {
    public static void main(String[] args) {
        //Node node= new Node(1);
        Node root= new Node(1);
        root.left= new Node(2);
        root.left.left= new Node(3);
        root.left.right= new Node(4);
        root.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);
        root.right.right.left= new Node(8);

        System.out.println("Hieght of tree is : "+ findHieght(root));

    }

    private static int findHieght(Node root) {
        if(root==null)
            return 0;
        return 1+Math.max(findHieght(root.left),findHieght(root.right));
    }
}
