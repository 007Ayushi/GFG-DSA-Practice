class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        
        int ans=1;
        
        //Method 1- Using Recursion
        for(int i=n;i>=1;i--){
            ans*=i;
        }
        return ans;
        
    }
}
