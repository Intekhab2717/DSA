package tree;

public class MaxiMumSum {
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

        System.out.println("Hieght of tree is : "+ findMaxSum(root));

    }

    private static int findMaxSum(Node root) {
        if (root==null)
            return 0;
        int[] sum=new int[1];
        findMax(root,sum);
        return sum[0];
    }

    private static int findMax(Node root, int[] sum) {
        if(root==null)
            return 0;
        int le=Math.max(0,findMax(root.left, sum));
        int ri=Math.max(0,findMax(root.right, sum));
        sum[0]=Math.max((le+ri+root.val), sum[0]);
        System.out.println(sum[0]);
        return root.val+Math.max(le,ri);
    }

}
