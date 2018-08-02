public class TwistedIdentical {
    public boolean twistedIdentical(TreeNode root){
        return helper(root, root);
    }
    private boolean helper(TreeNode one, TreeNode two){
        if(one == null && two == null){
            return true;
        }
        if(one == null || two == null){
            return false;
        }
        if(one.key != two.key){
            return false;
        }
        return (helper(one.left, two.left) && helper(one.right, two.right)) || (helper(one.left, two.right) && helper(one.right, two.left));
    }
}//Time: O(n^2), Space: O(height)
