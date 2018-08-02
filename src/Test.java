public class Test {
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(7);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.right = t6;

        TreeNode A = null;
        TreeNode B = null;
        TreeNode root = new TreeNode(10);
        root.left = A;
        root.right = B;

        GetHeight sol = new GetHeight();
        System.out.println(sol.getHeight(t1));
        System.out.println(sol.getHeight(A));
        System.out.println(sol.getHeight(root));

        CountNodes sol1 = new CountNodes();
        System.out.println(sol1.countNodes(t1));


        IfBalanced sol2 = new IfBalanced();
        System.out.println(sol2.ifBalanced(t1));
        System.out.println(sol2.ifBalanced(A));
        System.out.println(sol2.ifBalanced(root));

        IsSymmetric sol3 = new IsSymmetric();
        System.out.println(sol3.isSymmetric(t1));
        System.out.println(sol3.isSymmetric(A));
        System.out.println(sol3.isSymmetric(root));

        TwistedIdentical sol4 = new TwistedIdentical();
        System.out.println(sol4.twistedIdentical(t1));
        System.out.println(sol4.twistedIdentical(A));
        System.out.println(sol4.twistedIdentical(root));

        IsBST sol5 = new IsBST();
        System.out.println(sol5.isBST(t1));
        System.out.println(sol5.isBST(A));
        System.out.println(sol5.isBST(root));

        int min = 0, max = 7;
        PrintBST sol6 = new PrintBST();
        System.out.println(sol6.getRange(t1, min, max));
        System.out.println(sol6.getRange(A, min, max));
        System.out.println(sol6.getRange(root, min, max));
    }
}
