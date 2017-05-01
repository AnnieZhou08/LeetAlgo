/**
 * Definition of ArrayReader:
 * 
 * class ArrayReader {
 *      // get the number at index, return -1 if index is less than zero.
 *      public int get(int index);
 * }
 */
public class Solution {
    /**
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return : An integer which is the index of the target number
     */
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        int index = 1;
        while(reader.get(index-1) < target){
            index *= 2;
        }
        int start = 0;
        int end = index;
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(reader.get(mid) == target){
                end = mid;
            }else if(reader.get(mid) < target){
                start = mid;
            }else if(reader.get(mid) > target){
                end = mid;
            }
        }
        if(reader.get(start) == target) return start;
        if(reader.get(end) == target) return end;
        return -1;
    }
}
//http://www.lintcode.com/en/problem/search-in-a-big-sorted-array/#description