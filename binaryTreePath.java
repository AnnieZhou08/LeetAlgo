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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result = new ArrayList <String>();
        if (root != null){
            searchBT (root, "", result);
        }
        return result;
        
    }
    private void searchBT(TreeNode root, String path, List<String> result){
        if (root.right == null && root.left == null){
            path += root.val;
            result.add(path);
        }
        if (root.right != null){
            searchBT(root.right, path + root.val + "->", result);
        }
        if (root.left != null){
            searchBT(root.left, path + root.val + "->", result);
        }
    }
}