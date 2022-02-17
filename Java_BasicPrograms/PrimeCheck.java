import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        if (n == 0 || n == 1) {
            System.out.println("It is not a Prime number");
        } else {
            // int m = n/2;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                System.out.println("It is not a prime number");
            } else {
                System.out.println("The given number is prime number");
            }
        }

    }
}
