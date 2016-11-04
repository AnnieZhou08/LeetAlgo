public class Solution {
    public static String addBinary(String a, String b) {
        int lengtha = a.length();
        int lengthb = b.length();
        int lengthmax = Math.max (lengtha, lengthb);
        int lengthmin = Math.min (lengtha, lengthb);
        int diff = lengthmax - lengthmin;
        char [] newa = new char [lengthmax];
        char [] newb = new char [lengthmax];
        
        char [] result = new char [lengthmax];
        int carry = 0;
        
        HashMap <Character, Integer> map = new HashMap <Character, Integer>();
        map.put ('1', 1); map.put ('0', 0);
        
        if (lengtha != lengthb){
            if (lengtha < lengthb){
                for (int i = 0; i < diff; i++){
                    newa[i] = '0';
                    newb[i] = b.charAt(i);
                }
                for (int i = 0; i < lengtha; i++){
                    newa[diff+i] = a.charAt(i);
                    newb[diff+i] = b.charAt(diff+i);
                }
            }
            else {
                for (int i = 0; i < diff; i++){
                    newb[i] = '0';
                    newa[i] = a.charAt(i);
                }
                for (int i = 0; i < lengthb; i++){
                    newb[diff+i] = b.charAt(i);
                    newa[diff+i] = a.charAt(diff+i);
                }
            }
        }
        else {
            for (int i = 0; i < lengthmax; i ++){
                newa[i] = a.charAt(i);
                newb[i] = b.charAt(i);
            }
        }
        
        while (lengthmax >= 1){
            if (map.get(newa[lengthmax-1]) + map.get (newb[lengthmax-1]) + carry == 3){
                result[lengthmax-1] = '1';
                carry = 1;
            }
            else if (map.get (newa[lengthmax-1]) + map.get (newb[lengthmax-1]) + carry == 2){
                result[lengthmax-1] = '0';
                carry = 1;
            }
            else if (map.get (newa[lengthmax-1]) + map.get (newb[lengthmax-1]) + carry == 1){
                result[lengthmax-1] = '1';
                carry = 0;
            }
            else if (map.get (newa[lengthmax-1]) + map.get (newb[lengthmax-1]) + carry == 0){
                result[lengthmax-1] = '0';
                carry = 0;
            }
            lengthmax--;
        }
        if (carry == 0){
            String s = new String (result);
            return s;
        }
        else {
            String s = "1" + new String (result);
            return s;
        }
        
    }
        
}