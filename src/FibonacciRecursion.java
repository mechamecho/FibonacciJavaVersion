import java.util.Scanner;

/**
 * Created by Engineer on 6/3/2017.
 */
public class FibonacciRecursion {

    public static void main (String[] args){
      Scanner in= new Scanner(System.in);
      System.out.println("Please enter the number you want to find the fibonacci value for:");
      int x=in.nextInt();
      int fibonacci=fib(x);
      System.out.print("The fibonacci of number "+x+" ="+fibonacci);



    }

    public static int fib(int n){
        if (n<=0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }



}
