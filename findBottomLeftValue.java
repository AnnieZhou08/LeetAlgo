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
    int ans=0; 
    int h = 0;
    public int findBottomLeftValue(TreeNode root) {
        findValue(root, 1);
        return ans;
    }
    public void findValue(TreeNode root, int depth){
        if(h < depth){
            h = depth;
            ans = root.val;
        }
        if(root.left != null){
            findValue(root.left, depth+1);
        }
        if(root.right != null){
            findValue(root.right, depth+1);
        }
    }
}