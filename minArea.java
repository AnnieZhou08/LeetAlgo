public class Solution {
    /**
     * @param image a binary matrix with '0' and '1'
     * @param x, y the location of one of the black pixels
     * @return an integer
     */
    //1. find first index of black square in columns
    //2. find last index of black square in columns
    //3. find first index of black square in rows
    //4. find last index of black square in rows
    //5. subtract and multiply to find area of rectangle
    public int minArea(char[][] image, int x, int y) {
        // Write your code here
        int topIndex = firstRowIndex(image, 0, x);
        int bottomIndex = lastRowIndex(image, x, image.length-1);
        int leftIndex = firstColIndex(image, 0, y);
        int rightIndex = lastColIndex(image, y, image[0].length-1);
        
        return (rightIndex - leftIndex + 1) * (bottomIndex - topIndex + 1);
       
    }
    
    public int firstRowIndex(char[][] image, int start, int end){
        
        while(start + 1 < end){
            int mid = start + (end-start)/2;
            if(!containsBlackRow(image, mid)){
                start = mid;
            }else{
                end = mid;
            }
        }
        if(containsBlackRow(image, start)){
            return start;
        }
        return end;
        
    }
    
    public int lastRowIndex(char[][] image, int start, int end){
        
        while(start + 1 < end){
            int mid = start + (end-start)/2;
            if(!containsBlackRow(image,mid)){
                end = mid;
            }else{
                start = mid;
            }
        }
        if(containsBlackRow(image, end)){
            return end;
        }
        return start;
    }
    
    public int firstColIndex(char[][] image, int start, int end){
        
        while(start + 1 < end){
            int mid = start + (end-start)/2;
            if(!containsBlackCol(image, mid)){
                start = mid;
            }else{
                end = mid;
            }
        }
        if(containsBlackCol(image, start)){
            return start;
        }
        return end;
    }
    
    public int lastColIndex(char[][] image, int start, int end){
        
        while(start + 1 < end){
            int mid = start + (end-start)/2;
            if(!containsBlackCol(image, mid)){
                end = mid;
            }else{
                start = mid;
            }
        }
        if(containsBlackCol(image,end)){
            return end;
        }
        return start;
    }
    
    public boolean containsBlackRow(char[][] image, int x){
        for(int i = 0; i < image[0].length; i++){
            if(image[x][i] == '1'){
                return true;
            }
        }
        return false;
    }
    
    public boolean containsBlackCol(char[][] image, int y){
        for(int i = 0; i < image.length; i++){
            if(image[i][y] == '1'){
                return true;
            }
        }
        return false;
    }
    
    
}