public class Solution {
   
    public int sumNumbers(TreeNode root) {
         List<Integer> nums = new ArrayList<Integer>();
         int sum = 0;
         if(root == null){
             return sum;
         }
         allNums(root, 0, nums);
         System.out.println(nums);
         for(int n : nums){
             sum += n;
         }
         return sum;
    }
    public void allNums(TreeNode root, int acc, List<Integer> nums){
        if(root.left == null && root.right == null){
            nums.add(acc*10 + root.val);
        }else if (root.left == null){
            allNums(root.right, acc*10+root.val, nums);
        }else if (root.right == null){
            allNums(root.left, acc*10+root.val, nums);
        }else{
            allNums(root.left, acc*10+root.val, nums);
            allNums(root.right, acc*10+root.val, nums);
        }
    }
}