package tree;

public class CheckBalence {
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
        root.right.left.left= new Node(7);
        root.right.left.left.left= new Node(5);

        System.out.println(" IsTree balanced : "+ isBalence(root));

    }

    private static boolean isBalence(Node root) {
        return checkBalence(root) != -1;
    }

    private static int checkBalence(Node root) {
        if (root==null)
            return 0;
        int left=checkBalence(root.left);
        if(left==-1) return -1;
        int right=checkBalence(root.right);
        if(right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left,right)+1;
    }
}
