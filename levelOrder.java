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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList <List<Integer>> allLevels = new ArrayList <List<Integer>>();
        levelHelper(allLevels, root, 0);
        
        return allLevels;
    }
    
    public void levelHelper(List<List<Integer>> allLevels, TreeNode root, int height){
        if (root == null) return;
        if (height >= allLevels.size()){
            allLevels.add(new ArrayList<Integer>());
        }
        allLevels.get(height).add(root.val);
        levelHelper(allLevels, root.left, height+1);
        levelHelper(allLevels, root.right, height+1);
    }
}