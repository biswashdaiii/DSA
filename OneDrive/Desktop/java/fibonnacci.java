public class fibonnacci {
    int fib(int n , int x){
        if (n==0) return 0;
        if(n==1) return 1;
        if(x[n]!=-1){
            return x[n];
        }
        x[n]= fib(n-1,x)+fib(n-2,x);
        return x[n];
    }

public static void main(String[] args) {
    fibonnacci f = new fibonnacci();
    int n=100;
    
    int x[]= new int[n+1];
    System.out.println("printing fibo of " +n);
    System.out.println();
}
}
