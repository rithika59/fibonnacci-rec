/* Fibonacci recursive */

public class fib2
{
    static int n1 =0, n2=1, n3 =0;
    public static void printFib(int c){
        
        if(c>0)
        {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            printFib(c-1);
        }
    }
    public static void main(String[]args){
        int count = 10;
        System.out.println(0);
        System.out.println(1);
        printFib(count);
        
    }
}