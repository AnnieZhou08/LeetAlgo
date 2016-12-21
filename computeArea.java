public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C - A) * (D - B);
        int area2 = (G - E) * (H - F);
        
        int top = Math.min(D, H);
        int right = Math.min(C, G);
        int left = Math.max(E, A);
        int bottom = Math.max (B, F);
        
        int overlap = 0;
        
        if (top > bottom && right > left){
            overlap = (right - left)*(top-bottom);
        }
        
        return area1+area2-overlap;
        
        
    }
}