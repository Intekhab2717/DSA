package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverSal {
    public static void main(String[] args) {
        //Node node= new Node(1);
        Node root= new Node(1);
        root.left= new Node(2);
        root.left.left= new Node(3);
        root.left.right= new Node(4);
        root.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        ArrayList<List<Integer>> res =levelOrder(root);
        System.out.println(res);

    }

    private static ArrayList<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        if(root==null)
            return res;
        while (!q.isEmpty()) {
            int size= q.size();
            ArrayList<Integer> list =new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }

                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                 list.add(q.poll().val);
            }
            res.add(list);
        }
    return res;
    }
}
