package tree;

import java.util.ArrayList;

public class PreOrderTraversal {
    public static void main(String[] args) {
    //Node node= new Node(1);
        Node root= new Node(1);
        root.left= new Node(2);
        root.left.left= new Node(3);
        root.left.right= new Node(4);
        root.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<Integer> list1 =inOrder(root,list);
        System.out.println("Find Inorde"+ list1);
    }

    private static ArrayList<Integer> inOrder(Node root, ArrayList<Integer> list) {
        //ArrayList<Integer> list =new ArrayList<>();
        if(root==null)
            return list;
        System.out.print(root.val+" ");
        list.add(root.val);
        inOrder(root.left, list);
        inOrder(root.right,list);

        //return list;
        return list;
    }
}
