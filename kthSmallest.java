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
    public int kthSmallest(TreeNode root, int k) {
        if(k == countNodes(root.left)+1){
            return root.val;
        }else if (k > countNodes(root.left)+1){
            return kthSmallest(root.right, k-countNodes(root.left)-1);
        }
        return kthSmallest(root.left, k);
    }
    
   public int countNodes(TreeNode root){
       if(root == null){
           return 0;
       }
       return 1 + countNodes(root.right) + countNodes(root.left);
   }
}