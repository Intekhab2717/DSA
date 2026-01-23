package tree;

import java.util.ArrayList;

public class LeftView {
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
        leftView(root,list,0);
        System.out.println(list);

    }

    private static void leftView(Node root, ArrayList<Integer> list, int level) {
        if (root==null)
            return;
        if(list.size()==level)
            list.add(root.val);

        leftView(root.left,list,level+1);
        leftView(root.right,list,level+1);
    }
}
