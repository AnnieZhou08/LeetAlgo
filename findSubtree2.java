/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root the root of binary tree
     * @return the root of the maximum average of subtree
     */
     
    private class ResultType{
        public int sum, numNodes;
        public ResultType(int sum, int numNodes){
            this.sum = sum;
            this.numNodes = numNodes;
        }
    }
    
    private TreeNode result = null;
    private ResultType maxAvg = null;
    
    public TreeNode findSubtree2(TreeNode root) {
        // Write your code here
        helper(root);
        return result;
    }
    
    public ResultType helper(TreeNode root){
        if(root == null){
            return new ResultType(0, 0);
        }
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        
        ResultType curr = new ResultType(left.sum+right.sum+root.val,
                                         left.numNodes+right.numNodes+1);
        
        if(result == null || curr.sum * maxAvg.numNodes > curr.numNodes * maxAvg.sum){
            result = root;
            maxAvg = curr;
        }
        return curr;
    }
}