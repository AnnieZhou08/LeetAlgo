public static int climbStairs(int n){
        int result = 0;
        if (n == 1){
            result = 1;
            return result;
        }
        if (n == 2){
            result = 2;
            return result;
        }
        else {
            result = climbStairs (n-1) + climbStairs (n-2);
        }
        
        return result;
    }