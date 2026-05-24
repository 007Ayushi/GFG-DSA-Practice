class Solution {
    public void printTillN(int n) {
        // code here
      int x=1;
       print(x,n);
        
    }
    public void print(int x, int n){
        if(x==n+1)return;
        System.out.print(x+" ");
        print(x+1,n);
        
    }
}