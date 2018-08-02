public class Test {
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.left = t6;

        GetHeight sol = new GetHeight();
        System.out.println(sol.getHeight(t1));

        CountNodes sol1 = new CountNodes();
        System.out.println(sol1.countNodes(t1));

        IfBalanced sol2 = new IfBalanced();
        System.out.println(sol2.ifBalanced(t1));

        IsSymmetric sol3 = new IsSymmetric();
        System.out.println(sol3.isSymmetric(t1));

        TwistedIdentical sol4 = new TwistedIdentical();
        System.out.println(sol4.twistedIdentical(t1));
    }
}
