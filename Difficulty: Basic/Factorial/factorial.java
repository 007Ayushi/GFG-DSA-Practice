class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        
        //base case
        if(n==0 || n==1)return 1;
        return n*factorial(n-1);
    }
}
