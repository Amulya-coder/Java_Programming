import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        /** Without Recursion **/
        // int i,fact=1;
        //
        // for(i=1;i<=n;i++){
        // fact=fact*i;
        // }
        // System.out.println("Factorial of "+n+" is "+fact);

        /** With Recursion **/
        int fact = factorial(n);
        System.out.println("Factorial of " + n + " is " + fact);
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);

    }
}
