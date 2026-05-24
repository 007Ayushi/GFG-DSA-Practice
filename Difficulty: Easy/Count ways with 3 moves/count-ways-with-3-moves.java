class Solution {

    static int countWays(int n) {
        // add your code here
        
        if(n==1 || n==2)return n;
        if(n==3)return 4;
        return countWays(n-1)+countWays(n-2)+countWays(n-3);
    }
}
