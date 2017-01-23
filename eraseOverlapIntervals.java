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
    public int eraseOverlapIntervals(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>() {
           public int compare(Interval a, Interval b){
               return a.end - b.end;
           }
        });
        
        if(intervals.length == 0) return 0;
        int count = 1;
        int end = intervals[0].end;
        
        for(int i = 0; i < intervals.length; i++){
            if(intervals[i].start >= end){
                count++;
                end = intervals[i].end;
            }
        }
        
        return intervals.length - count;
    }
}