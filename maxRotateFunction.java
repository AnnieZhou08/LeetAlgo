public class Solution {
    public int maxRotateFunction(int[] A) {
        int counter = 0;
        int n = A.length;
        int prevResult = Integer.MIN_VALUE;
        int newResult = 0;
        int newIndex;
        
        while (counter < n){
            for (int i = 0; i < n; i++){
                if (i - counter < 0){
                    newIndex = n + (i - counter);
                } else {
                    newIndex = i - counter;
                }
                newResult += newIndex * A[i];
            }
            prevResult = Math.max (prevResult, newResult);
            newResult = 0;
            counter++;
        }
        if (n == 0){
            return 0;
        }
        return prevResult;
    }
}