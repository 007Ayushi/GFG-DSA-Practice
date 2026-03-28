class Solution {
    void printInvertedPyramid(int n) {
        // code here
        StringBuilder sb=new StringBuilder();
     for(int i=1;i<=n;i++){
         for(int j=n;j>=i;j--){
             sb.append("*");
             if(j!=i)sb.append(" ");
         }
         if(i!=n)sb.append("\n");
     }   
     System.out.println(sb);
    }
}