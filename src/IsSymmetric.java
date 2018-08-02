/*
            10
     5a     |       5b
  1a    3a  |    3b    1b
2a 4a 6a  8a|  8b 6b 4b  2b
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root){
        return helper(root, root);
    }
    private boolean helper(TreeNode A, TreeNode B){
        if(A == null && B == null){
            return true;
        }
        if(A == null || B == null){
            return false;
        }
        return (A.key == B.key) && helper(A.left, B.right) && helper(A.right, B.left);
    }
}//Time: O(nlogn), Space: O(height), (logn - n)
