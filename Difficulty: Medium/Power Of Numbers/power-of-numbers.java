class Solution {
    public int reverseExponentiation(int n) {
        // code here
       
      int r=rev(n);
      return pow(n,r);
      
    }
    
    public int pow(int a,int b){
        if(b==0)return 1;
        return a*pow(a,b-1);
    }
    public static int rev(int n){
        int r=0;
        while(n!=0){
            int rem=n%10;
            r=r*10+rem;
            n=n/10;  
        }
        return r;
    }
    
}
