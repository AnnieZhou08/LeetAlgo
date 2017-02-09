public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        int counter = 0;
        
        one_res(res, "", n, counter);
        
        return res;
    }
    public void one_res(List<String> res, String curr, int n, int counter){
        
        if(n == 0 && counter == 0){
            res.add(curr);
        }else if(counter == 0){
            curr = curr+"(";
            one_res(res, curr, n-1, counter+1);
        }else if(n == 0 && counter > 0){
            curr = curr+")";
            one_res(res,curr,n, counter-1);
        }
        else{
            one_res(res, curr+"(", n-1, counter+1);
            one_res(res, curr+")", n, counter-1);
        }
    }
}