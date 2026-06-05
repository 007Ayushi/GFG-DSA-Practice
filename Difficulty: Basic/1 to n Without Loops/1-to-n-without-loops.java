class Solution {
    public void printTillN(int n) {
        // code here
       
       int m=1;
       print(m,n);
       
    }
    public void print(int m,int n){
      if(m==n+1)return;
       System.out.print(m+" ");
       print(m+1,n);
    }
}