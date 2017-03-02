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
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    public int[] findFrequentTreeSum(TreeNode root) {
        findSum(root);
        int maxval = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() >= maxval){
                maxval = entry.getValue();
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxval){
                res.add(entry.getKey());
            }
        }
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        
        return result;
    }
    
   
    
    public int findSum(TreeNode root){
        
        if(root == null){
            return 0;
        }
        int left_sum = findSum(root.left);
        int right_sum = findSum(root.right);
        int curr_sum = root.val + left_sum + right_sum;
        
        if(map.containsKey(curr_sum)){
            map.put(curr_sum, map.get(curr_sum)+1);
        }else{
            map.put(curr_sum, 1);
        }
        
        return curr_sum;
    }
}