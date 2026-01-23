package tree;

public class PostOrderTraversal {
    public static void main(String[] args) {
        //Node node= new Node(1);
        Node root= new Node(1);
        root.left= new Node(2);
        root.left.left= new Node(3);
        root.left.right= new Node(4);
        root.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        postOrder(root);

    }

    private static void postOrder(Node root) {

        if(root==null)
            return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");

    }
}
