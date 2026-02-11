class Solution {
    public int reverseExponentiation(int n) {
        // code here
        
        int a=n;
        int b=reverse(a);
        
        return pow(a,b);
    }
    public int pow(int a,int b){
        if(b==0)return 1;
        return a*pow(a,b-1);
    }
    public int reverse(int n){
        int rev=0;
        
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}
