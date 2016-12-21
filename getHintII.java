public class Solution {
    public String getHint(String secret, String guess) {
        char sec[] = secret.toCharArray();
        char gue[] = guess.toCharArray();
        
        int[] secretarr = new int[10];
        int[] guessarr = new int [10];
        
        int bull = 0;
        int cow = 0;
        
        for (int i = 0; i < sec.length; i++){
            if (sec[i] == gue[i]){
                bull++;
            } else {
                secretarr[sec[i]-'0']++;
                guessarr[gue[i]-'0']++;
            }
        }
        for (int i = 0; i < 10; i++){
            cow += Math.min(secretarr[i], guessarr[i]);
        }
        return bull + "A" + cow + "B";
        
    }
}