public class Solution {
    public boolean isHappy(int n) {
        int c = newnumber(n);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(n);
        
        while (c != 1){
            if (list.contains(c)){
                return false;
            } else {
                list.add(c);
                c = newnumber (c);
            }
        }
        return true;
    }
    private int newnumber (int n){
        int a = 0;
        while (n != 0){
            a+= Math.pow (n%10, 2);
            n = n/10;
        }
        
        return a;
    }
}