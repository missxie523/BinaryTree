import java.util.ArrayList;
import java.util.List;

/*
Given two values k1 and k2 (where k1 < k2) and a root pointer to a binary search tree.
Print all the keys of tree in range k1 to k2.
Print all the keys in an increasing order.
 */
public class PrintBST {
    public List<Integer> getRange(TreeNode root, int min, int max){
        List<Integer> list = new ArrayList<Integer>();
        helper(root, min, max, list);
        return list;
    }
    private void helper(TreeNode root, int min, int max, List<Integer> list){
        if(root == null){
            return;
        }
        if(root.key > min){
            helper(root.left, min, max, list);
        }
        if(root.key >= min && root.key <= max){
            list.add(root.key);
        }
        if(root.key < max){
            helper(root.right, min, max, list);
        }
    }
}//Time: O(n), Space: O(height)
