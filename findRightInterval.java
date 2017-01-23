/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public int[] findRightInterval(Interval[] intervals) {
        int[] res = new int[intervals.length];
        java.util.NavigableMap<Integer, Integer> intervalMap = new TreeMap<>();
        
        for(int i = 0; i<intervals.length; i++){
            intervalMap.put(intervals[i].start, i);
        }
        
        for(int i = 0; i<intervals.length; i++){
            Map.Entry<Integer, Integer> entry = intervalMap.ceilingEntry(intervals[i].end);
            res[i] = (entry != null) ? entry.getValue() : -1;
        }
        
        return res;
    }
}