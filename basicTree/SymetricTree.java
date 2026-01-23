package tree;

public class SymetricTree {
    public static void main(String[] args) {
        //Node node= new Node(1);
        Node root= new Node(1);
        root.left= new Node(2);
        root.left.left= new Node(3);
        //root.left.left.left= new Node(4);
        root.left.right= new Node(4);
        root.right= new Node(2);
        root.right.left= new Node(4);
        root.right.right= new Node(3);

        System.out.println("Both tree is : "+ checkSymetric(root));

    }

    private static boolean checkSymetric(Node root) {
        return root==null || checkSymetricHelper(root.left, root.right);
    }

    private static boolean checkSymetricHelper(Node left, Node right) {
        if(left==null || right==null){
            return left==right;
        }
        if(left.val!=right.val){
            return false;
        }
        return checkSymetricHelper(left.left, right.right) && checkSymetricHelper(left.right,right.left);
    }
}
