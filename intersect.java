public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> map1 = new HashMap <Integer, Integer> ();
        HashMap <Integer, Integer> map2 = new HashMap <Integer, Integer> ();
        
        ArrayList <Integer> res =  new ArrayList <Integer>();
        
        for (int n : nums1){
            if (map1.containsKey(n)){
                map1.put(n, map1.get(n)+1);
            } else {
                map1.put(n, 1);
            }
        }
        for (int n : nums2){
            if (map2.containsKey(n)){
                map2.put(n, map2.get(n)+1);
            } else {
                map2.put(n,1);
            }
        }
        
        for (int n : map2.keySet()){
            if (map1.containsKey(n)){
                int counter = 0;
                while (counter < Math.min(map1.get(n), map2.get(n))){
                    res.add(n);
                    counter++;
                }
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = res.get(i);
        }
        return result;
    }
}