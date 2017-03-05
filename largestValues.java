/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(res, root, 0);
        return res;
    }
    public void helper (List<Integer> res, TreeNode root, int d){
        if(root == null){
            return;
        }
        if(res.size() == d){
            res.add(root.val);
        }else{
            res.set(d, Math.max(root.val, res.get(d)));
        }
        helper(res, root.left, d+1);
        helper(res, root.right, d+1);
    }
}