class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        
        int answer=1;
        for(int i=1;i<=n;i++){
            answer*=i;
        }
        return answer;
    }
}
