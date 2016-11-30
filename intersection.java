public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet <Integer>();
        
        for (int num : nums1){
            set.add(num);
        }
        
        List<Integer> intersect = new ArrayList <> ();
        
        for (int num: nums2){
            if (set.remove(num)){
                intersect.add(num);
            }
        }
        int [] result = new int [intersect.size()];
        for (int i = 0; i < result.length; i++){
            result [i] = intersect.get(i);
        }
        
        return result;
    }
}