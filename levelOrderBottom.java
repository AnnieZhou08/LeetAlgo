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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List <Integer>> result = new ArrayList<List <Integer>>();
        levelOrderHelper (root, result, 0);
        
        return result;
    }
    private void levelOrderHelper (TreeNode root, List<List<Integer>> result, int height){
        if (root == null) return;
        if (height >= result.size()){
            result.add(0, new ArrayList<Integer>());
        }
        levelOrderHelper (root.left, result, height+1);
        levelOrderHelper (root.right, result, height+1);
        result.get(result.size()-1-height).add(root.val);
    }
}