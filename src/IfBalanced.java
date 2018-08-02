public class IfBalanced {
    public boolean ifBalanced(TreeNode root){
        if(root == null){
            return true;
        }
        boolean left = ifBalanced(root.left);
        boolean right = ifBalanced(root.right);
        if(!left || !right){
            return false;
        }
        int height = helper(root);
        if(height == -1){
            return false;
        }
        return true;
    }

    private int helper(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftHeight = helper(root.left);
        int rightHeight = helper(root.right);
        if(leftHeight == -1 || rightHeight == -1){
            return -1;
        }
        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}//Time: O(nlogn), Space: O(height), (logn - n)
