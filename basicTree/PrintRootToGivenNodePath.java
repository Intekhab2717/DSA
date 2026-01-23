package tree;

import java.util.ArrayList;

public class PrintRootToGivenNodePath {
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
        int targetnode=7;
        System.out.println("path of target Node is  : "+ findPath(root,targetnode));

    }

    private static ArrayList<Integer> findPath(Node root , int target) {
        ArrayList<Integer> path =new ArrayList<>();
        if (root==null)
            return path;
        int[] sum=new int[1];
        findFullPath(root,target,path);
        return path;
    }

    private static boolean findFullPath(Node root, int target, ArrayList<Integer> path) {
        if(root==null)
            return false;
        path.add(root.val);
        if(root.val==target)
            return true;
        if(findFullPath(root.left,target,path) || findFullPath(root.right,target,path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}
