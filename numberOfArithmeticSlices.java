public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        //a smaller slice of arithmetic seq is a slice of bigger arithmetic seq
        //we just have to find all of the longest ari seq in A
        System.out.println(getSlices(A));
        List <Integer> indeces = getSlices(A);
        int count = 0;
        for (int i = 0; i < indeces.size(); i+=2){
            int startIndex = indeces.get(i);
            int endIndex = indeces.get(i+1);
            int d = endIndex - startIndex;
            for (int j = 1; j < d; j++){
                count += j;
            }
        }
        return count;
    }
    public List<Integer> getSlices(int[] A){
        int startIndex = 0;
        int endIndex = 1;
        boolean hadSeries = false;
        ArrayList <Integer> res = new ArrayList<Integer>();
        
        for (int i = 1; i < A.length-1; i++){
            int d1 = A[i] - A[i-1];
            int d2 = A[i+1] - A[i];
            if (d2 != d1){
                if(endIndex > startIndex + 1){
                    res.add(startIndex);
                    res.add(endIndex);
                }
                startIndex = i;
                endIndex = i+1;
                hadSeries = false;
            }else{
                hadSeries = true;
                endIndex++;
            }
        }
        if(hadSeries == true){
            res.add(startIndex);
            res.add(endIndex);
        }
        return res;
    }
}