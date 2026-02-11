class Solution {
    static void printTillN(int N) {
        // code here
        int num=1;
        print(num,N);
       
        
    }
    static void print(int num,int N){
         if(num>N)return ;
        System.out.print(num+" ");
        print(num+1,N);
        
    }
}