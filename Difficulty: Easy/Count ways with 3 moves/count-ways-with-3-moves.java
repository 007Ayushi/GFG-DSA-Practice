class Solution {

    static int countWays(int n) {
        // add your code here
        
        if(n==3)return 4;
        if(n<=2)return n;
        return countWays(n-1)+countWays(n-2)+countWays(n-3);
    }
}
