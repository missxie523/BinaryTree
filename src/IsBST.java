public class IsBST {
    public boolean isBST(TreeNode root){
        if(root == null){
            return true;
        }
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean helper(TreeNode root, int left, int right){
        if(root == null){
            return true;
        }
        if(root.key <= left || root.key >= right){
            return false;
        }
        return helper(root.right, root.key, right) && helper(root.left, left, root.key);
    }
}
