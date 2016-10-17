public class Solution {
    public int[] plusOne(int[] digits) {
      int length = digits.length; //gets length of the integer array
      
      //if all digits are 9's
      //returns an array of length+1 such that all following digits are 0 and the first digit is 1
      if (index(digits) < 0){
          int [] result = new int [length+1];
          result[0] = 1;
          for (int i = 1; i < length+1; i++){
              result[i] = 0;
          }
          return result;
      }
      //if the one's digit is not 9, then simply add 1 to the one's digit
      else if (index(digits) == length-1){
          int [] result = new int [length];
          for (int i = 0; i < length-1; i++){
              result[i] = digits[i];
          }
          result[length-1] = digits[length-1]+1;
          return result;
      }
      //if the one's digit to nth digit is a 9, then find the (n+1)th digit and add a 1 to it
      else {
          int [] result = new int [length];
          int j = index(digits);
          result [j] = digits[j]+1;
          
          for (int i = length-1; i > j; i--){
              result [i] = 0;
          }
          for (int k = 0; k < j; k++){
              result[k] = digits[k];
          }
          return result;
      }
      
    }
    
    //returns the first index of the array that's not 9 from ones digit
    //if all are 9's, returns -1
    private int index(int[] digits){
        int length = digits.length;
        
        for (int i = length-1; i >= 0; i--){
          if (digits[i] != 9){
              return i;
          }
        }
        return -1;
    }
}