public class Solution {
    public int lastRemaining(int n) {
        int parity = 0;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            lst.add(i);
        }
        
        while(lst.size() > 1){
            if(parity%2 == 0){
                System.out.println(lst);
                for(int i = 0; i < lst.size(); i++){
                    lst.remove(i);
                }
            }else{
                System.out.println(lst);
                for(int j = lst.size()-1; j >= 0; j-=2){
                    lst.remove(j);
                }
            }
            parity++;
        }
        
        return lst.get(0);
    }
}