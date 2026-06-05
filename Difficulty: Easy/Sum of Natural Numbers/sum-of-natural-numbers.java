import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        
        int s=0;
        sum(s,n);
        
        
    }
    
    public static void sum(int s,int n){
        if(n==0){
            System.out.print(s);
            return;
        }
        sum(s+n,n-1);
    }
}